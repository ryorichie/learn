import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import streamlit as st
from babel.numbers import format_currency
sns.set_theme(style='dark')

def create_daily_orders_df(df):
    daily_orders_df = df.resample(rule='D', on='order_date').agg({
        'order_id': 'nunique',
        'total_price': 'sum',
    })
    daily_orders_df = daily_orders_df.reset_index()
    daily_orders_df.rename(columns={
        'order_id': 'order_count',
        'total_price': 'revenue',
    }, inplace=True)
    
    return daily_orders_df

def create_sum_order_item_df(df):
    sum_order_item_df = df.groupby('product_name').quantity_x.sum().sort_values(ascending=False).reset_index()
    return sum_order_item_df

def create_bygender_df(df):
    bygender_df = df.groupby(by='gender').customer_id.nunique().reset_index()
    bygender_df.rename(columns={
        'customer_id': 'customer_count'
    }, inplace=True)
    
    return bygender_df

def create_byage_df(df):
    byage_df = df.groupby(by="age_group").customer_id.nunique().reset_index()
    byage_df.rename(columns={
        "customer_id": "customer_count"
    }, inplace=True)
    byage_df['age_group'] = pd.Categorical(byage_df['age_group'], ["Youth", "Adults", "Seniors"])
    
    return byage_df

def create_bystate_df(df):
    bystate_df = df.groupby(by="state").customer_id.nunique().reset_index()
    bystate_df.rename(columns={
        "customer_id": "customer_count"
    }, inplace=True)
    
    return bystate_df

def create_rfm_df(df):
    rfm_df = df.groupby(by="customer_id", as_index=False).agg({
        "order_date": "max", #mengambil tanggal order terakhir
        "order_id": "nunique",
        "total_price": "sum"
    })
    rfm_df.columns = ["customer_id", "max_order_timestamp", "frequency", "monetary"]
    
    rfm_df["max_order_timestamp"] = rfm_df["max_order_timestamp"].dt.date
    recent_date = df["order_date"].dt.date.max()
    rfm_df["recency"] = rfm_df["max_order_timestamp"].apply(lambda x: (recent_date - x).days)
    rfm_df.drop("max_order_timestamp", axis=1, inplace=True)
    
    return rfm_df