import pandas as pd
 
 # Menggabungkan data di Pandas
 
product_df = pd.read_csv("product.csv")
orders_df = pd.read_csv("orders.csv")
 
new_order_df = pd.merge(
    left=product_df,
    right=orders_df,
    how="inner",
    left_on="product_id",
    right_on="product_id"
)

# Drop Data Untuk Menghilangkan Outlier
df = pd.read_csv("data.csv")
 
Q1 = (df['TotalCharges']).quantile(0.25)
Q3 = (df['TotalCharges']).quantile(0.75)
IQR = Q3 - Q1
 
maximum = Q3 + (1.5*IQR)
minimum = Q1 - (1.5*IQR)
 
kondisi_lower_than = df['TotalCharges'] < minimum
kondisi_more_than = df['TotalCharges'] > maximum
 
df.drop(df[kondisi_lower_than].index, inplace=True)
df.drop(df[kondisi_more_than].index, inplace=True)

# Imputation UNutk Mneghilangkan Outlier; Impute mean replace
# df = pd.read_csv("data.csv")
 
# Q1 = (df['TotalCharges']).quantile(0.25)
# Q3 = (df['TotalCharges']).quantile(0.75)
# IQR = Q3 - Q1
 
# maximum = Q3 + (1.5*IQR)
# minimum = Q1 - (1.5*IQR)
 
# kondisi_lower_than = df['TotalCharges'] < minimum
# kondisi_more_than = df['TotalCharges'] > maximum
 
# df.mask(cond=kondisi_more_than, maximum, axis=1, inplace=True)
# df.mask(cond=kondisi_lower_than, minimum, axis=1, inplace=True)

# Mengatasi Duplicate Data dengan Drop
df = pd.read_csv("data.csv")
df.drop_duplicates(inplace=True)