import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
import streamlit as st
from babel.numbers import format_currency
sns.set_theme(style='dark')

hourly_df = pd.read_csv('hour.csv')
daily_df = pd.read_csv('day.csv')

composite_df = pd.merge(
    daily_df,
    hourly_df,
    how='left',
    on=['dteday','season','yr','mnth','holiday','weekday','workingday']
)
composite_df.dteday = pd.to_datetime(composite_df.dteday)
composite_df.rename(columns={
        'dteday': 'date',
        'yr': 'year',
        'mnth': 'month',
        'weathersit_x': 'daily_weather',
        'weathersit_y': 'hourly_weather',
        'temp_x': 'daily_temperature',
        'atemp_x': 'daily_feeling_temperature',
        'hum_x': 'daily_humidity',
        'windspeed_x': 'daily_windspeed',
        'casual_x': 'daily_casuals',
        'registered_x': 'daily_registered',
        'cnt_x': 'total_daily_users',
        'hr': 'hour',
        'temp_y': 'hourly_temperature',
        'atemp_y': 'hourly_feeling_temperature',
        'hum_y': 'hourly_humidity',
        'windspeed_y': 'hourly_windspeed',
        'casual_y': 'hourly_casuals',
        'registered_y': 'hourly_registered',
        'cnt_y': 'total_hourly_users', 
}, inplace=True)
composite_df.drop(['instant_x', 'instant_y'], axis=1, inplace=True)

daily_usage_by_weather = composite_df.groupby("daily_weather").total_daily_users.mean().sort_values(ascending=False).reset_index()
conditions = {
    'Clear': daily_usage_by_weather['daily_weather'] == 1,
    'Cloudy': daily_usage_by_weather['daily_weather'] == 2,
    'Light Rain': daily_usage_by_weather['daily_weather'] == 3,
    'Heavy Rain': daily_usage_by_weather['daily_weather'] == 4,
}

daily_usage_by_weather['daily_weather'] = np.select(conditions.values(), conditions.keys(), default=daily_usage_by_weather['daily_weather'])
daily_usage_by_weather.rename(columns={
        'total_daily_users': 'average daily usage',
        'daily_weather': 'daily weather',
}, inplace=True)

hourly_usage_by_weather = composite_df.groupby("hourly_weather").total_hourly_users.mean().sort_values(ascending=False).reset_index()
conditions = {
    'Clear': hourly_usage_by_weather['hourly_weather'] == 1,
    'Cloudy': hourly_usage_by_weather['hourly_weather'] == 2,
    'Light Rain': hourly_usage_by_weather['hourly_weather'] == 3,
    'Heavy Rain': hourly_usage_by_weather['hourly_weather'] == 4,
}

hourly_usage_by_weather['hourly_weather'] = np.select(conditions.values(), conditions.keys(), default=hourly_usage_by_weather['hourly_weather'])
hourly_usage_by_weather.rename(columns={
        'total_hourly_users': 'average hourly usage',
        'hourly_weather': 'hourly weather',
}, inplace=True)

seasonly_usage = composite_df.groupby("season").total_daily_users.mean().sort_values(ascending=False).reset_index()
conditions = {
    'Spring': seasonly_usage['season'] == 1,
    'Summer': seasonly_usage['season'] == 2,
    'Fall': seasonly_usage['season'] == 3,
    'Winter': seasonly_usage['season'] == 4,
}
seasonly_usage.rename(columns={
        'total_daily_users': 'average usage'
}, inplace=True)
seasonly_usage['season'] = np.select(conditions.values(), conditions.keys(), default=seasonly_usage['season'])

hourly_usage = composite_df.groupby("hour").total_hourly_users.mean().sort_values(ascending=False).reset_index()
hourly_usage.rename(columns={
        'total_hourly_users': 'average usage'
}, inplace=True)

weekday_usage = composite_df.groupby("weekday").total_daily_users.mean().sort_values(ascending=False).reset_index()
conditions = {
    'Sunday': weekday_usage['weekday'] == 0,
    'Monday': weekday_usage['weekday'] == 1,
    'Tuesday': weekday_usage['weekday'] == 2,
    'Wednesday': weekday_usage['weekday'] == 3,
    'Thuesday': weekday_usage['weekday'] == 4,
    'Friday': weekday_usage['weekday'] == 5,
    'Saturday': weekday_usage['weekday'] == 6,
}
weekday_usage.rename(columns={
        'total_daily_users': 'average usage'
}, inplace=True)
weekday_usage['weekday'] = np.select(conditions.values(), conditions.keys(), default=weekday_usage['weekday'])

holiday_usage = composite_df.groupby("holiday").total_daily_users.mean().sort_values(ascending=False).reset_index()
conditions = {
    'Non-Holiday': holiday_usage['holiday'] == 0,
    'Holiday': holiday_usage['holiday'] == 1,
}
holiday_usage['holiday'] = np.select(conditions.values(), conditions.keys(), default=holiday_usage['holiday'])

holiday_usage.rename(columns={
        'total_daily_users': 'average usage'
}, inplace=True)

workingday_usage = composite_df.groupby("workingday").total_daily_users.mean().sort_values(ascending=False).reset_index()
conditions = {
    'Non-workingday': workingday_usage['workingday'] == 0,
    'workingday': workingday_usage['workingday'] == 1,
}
workingday_usage['workingday'] = np.select(conditions.values(), conditions.keys(), default=workingday_usage['workingday'])


## Presentation
colors = ["#72BCD4", "#D3D3D3", "#D3D3D3", "#D3D3D3", "#D3D3D3"]

## streamlit
st.header('Bike Rental Statistic')

tab1, tab2, tab3 = st.tabs(["Weather", "Season", "Etc"])

with tab1:
    st.header('Average Bike Rental Usage by Weather')
    st.subheader('Daily')
    fig, ax = plt.subplots(figsize=(16, 8))
    sns.barplot(
        y="average daily usage",
        x="daily weather",
        data=daily_usage_by_weather.sort_values(by='average daily usage', ascending=False),
        palette=colors,
    )
    ax.set_ylabel(None)
    ax.set_xlabel("Weather Condition", fontsize=30)
    ax.tick_params(axis='y', labelsize=35)
    ax.tick_params(axis='x', labelsize=30)
    st.pyplot(fig)
    
    st.subheader('Hourly')
    fig, ax = plt.subplots(figsize=(16, 8))
    sns.barplot(
        y="average hourly usage",
        x="hourly weather",
        data=hourly_usage_by_weather.sort_values(by='average hourly usage', ascending=False),
        palette=colors,
    )
    ax.set_ylabel(None)
    ax.set_xlabel("Weather Condition", fontsize=30)
    ax.tick_params(axis='y', labelsize=35)
    ax.tick_params(axis='x', labelsize=30)
    st.pyplot(fig)
    
with tab2:
    st.header('Average Bike Rental Usage by Season')
    fig, ax = plt.subplots(figsize=(16, 8))
    sns.barplot(
        y="season",
        x="average usage",
        data=seasonly_usage.sort_values(by='average usage', ascending=False),
        palette=colors,
    )
    ax.set_ylabel(None)
    ax.set_xlabel("Usage", fontsize=30)
    ax.tick_params(axis='y', labelsize=35)
    ax.tick_params(axis='x', labelsize=30)
    st.pyplot(fig)

with tab3:
    fig, ax = plt.subplots(nrows=1, ncols=3, figsize=(30, 6))
    colors = ["#72BCD4", "#D3D3D3", "#D3D3D3", "#D3D3D3", "#D3D3D3"]
    sns.barplot(
        y="average usage",
        x="hour",
        data=hourly_usage.sort_values(by='average usage', ascending=False).head(4),
        palette=colors,
        ax = ax[0]
    )
    ax[0].set_ylabel(None)
    ax[0].set_xlabel(None)
    ax[0].set_title("4 Most Renting Hour", loc="center", fontsize=18)
    ax[0].tick_params(axis ='x', labelsize=15)

    sns.barplot(
        y="weekday",
        x="average usage",
        data=weekday_usage.sort_values(by='average usage', ascending=False),
        palette=colors,
        ax = ax[1]
    )
    ax[1].set_ylabel(None)
    ax[1].set_xlabel(None)
    ax[1].set_title("Average Weekday Usage", loc="center", fontsize=18)
    ax[1].tick_params(axis ='x', labelsize=15)

    sns.barplot(
        y="holiday",
        x="average usage",
        data=holiday_usage.sort_values(by='average usage', ascending=False),
        palette=colors,
        ax = ax[2]
    )
    ax[2].set_ylabel(None)
    ax[2].set_xlabel(None)
    ax[2].set_title("Average Holiday usage", loc="center", fontsize=18)
    ax[2].tick_params(axis ='x', labelsize=15)
    st.pyplot(fig)
