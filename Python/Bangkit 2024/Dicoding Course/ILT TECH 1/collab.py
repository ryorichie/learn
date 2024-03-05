import pandas as pd
import matplotlib as plt

df = pd.read_csv("Telco-Customer-Churn.csv")
print("Print df secara raw\n", df, 3*"\n")

print("Apabila mengeksekusi .info() pada df\n")
print(df.info(), 3*"\n")
print("Untuk Melihat Nilai Kosong Setiap Column, pakai .isna().sum()\n", df.isna().sum(), 3*"\n")
print("Untuk Melihat Data Duplikat\n", "Data Duplicate : ", df.duplicated().sum(), 3*"\n")
print("Melihat Desciption: .describe() hanya include numeric\n", df.describe(), 3*"\n")
print("Melihat Desciption: .describe(include='all') mengambil semua header\n", df.describe(include='all'), 3*"\n")


# Handling duplicate data
df.drop_duplicates() # pakai inplace=True kalau ingin data langsung masuk df
print("Data Duplikat Sudah Dihapus\n", "Data Duplicate : ", df.duplicated().sum(), 3*"\n")


print("Menghitung data yang kosong\n", df.isna().count(), 3*"\n")
df_dropped_rows = df.dropna() # menghitung kalo column kosong semua
df_dropped_columns = df.dropna(axis=1)
print("Baris Yang Dihapus dengan dropna\n", df_dropped_rows, 3*"\n")
print("Column yang Dihapus dengan dropna axis 1\n", df_dropped_columns, 3*"\n")


# Fill Data Kosong
df_filled = df.fillna(value=0)
print(f"Tabel Yang Sudah Di Fillna dengan 0 {df_filled.isna().sum()}")
print()

# df_filled_mean = df.fillna(df.mean()) bisa dilakukan dengan mean
# df_interpolate = (df.interpolate()) bisa dilakukan dengan interpolate

# Fill dengan simple imputer
import pandas as pd
from sklearn.impute import SimpleImputer

# Separate columns into numerical and categorical
numeric_cols = df.select_dtypes(include='number').columns
categorical_cols = df.select_dtypes(exclude='number').columns

# Impute missing values in numerical columns with mean
numeric_imputer = SimpleImputer(strategy='mean')
df[numeric_cols] = numeric_imputer.fit_transform(df[numeric_cols])

# Impute missing values in categorical columns with most frequent (mode)
categorical_imputer = SimpleImputer(strategy='most_frequent')
df[categorical_cols] = categorical_imputer.fit_transform(df[categorical_cols])


# Data Grouping
churn_grouped_df = df.groupby(by="Churn").agg({
    "customerID": "nunique",
    "MonthlyCharges": ["max", "min", "mean"],
    "TotalCharges": ["max", "min", "mean"],
    "tenure": ["max", "min", "mean"]
})

print(f"Tabel yang sudah digroup berdasarkan churn{churn_grouped_df}")
print()
InternetService_gruped = df.groupby(by='InternetService').customerID.nunique().sort_values(ascending=False)
print(f"Tabel yang sudah digroup berdasarkan internet service{InternetService_gruped}")
print()
gender_churn_grouped = df.groupby(by=["gender", "Churn"]).agg({
    "customerID": "nunique",
    "MonthlyCharges": "mean",
    "TotalCharges": "mean",
    "tenure": "mean"
})
print(f"Tabel yang sudah digroup berdasarkan gender dan Churn{gender_churn_grouped}")
print()

