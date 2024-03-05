import matplotlib.pyplot as plt
import pandas as pd
 
lemon_diameter = [6.44, 6.87, 7.7, 8.85, 8.15, 
                  9.96, 7.21, 10.04, 10.2, 11.06]
lemon_weight = [112.05, 114.58, 116.71, 117.4, 128.93, 
                132.93, 138.92, 145.98, 148.44, 152.81]
 
plt.plot(lemon_diameter, lemon_weight)
plt.show()

url = 'https://query1.finance.yahoo.com/v7/finance/download/BBCA.JK?period1=1644796800&period2=1676332800&interval=1d&events=history&includeAdjustedClose=true'
df = pd.read_csv(url)
df['Date'] = pd.to_datetime(df['Date'])
 
plt.figure(figsize=(12, 5))
plt.plot(df['Date'], df['Close'], color='red')
plt.xlabel('Date',size=15)
plt.ylabel('Price',size=15)
plt.show()

plt.figure(figsize=(12, 5))
plt.plot(df['Date'], df['Close'], label='Close', color='red')
plt.plot(df['Date'], df['Open'], label='Open', color='blue')
plt.title('BBCA Stock Price', size=20)
plt.xlabel('Date',size=15)
plt.ylabel('Price (IDR)',size=15)
plt.legend()
plt.show()