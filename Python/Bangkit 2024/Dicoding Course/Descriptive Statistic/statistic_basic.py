import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from scipy import stats

# Statistik Basic
jumlah_kucing = np.array([3,1,2,4,2,2,1,2,3,2,1,2,2,3])
rata_rata = np.mean(jumlah_kucing)
median = np.median(jumlah_kucing)
mode = stats.mode(jumlah_kucing)[0]

# Mengukur Dispersion
range = max(jumlah_kucing) - min(jumlah_kucing)
iqr = np.percentile(jumlah_kucing, 75) - np.percentile(jumlah_kucing, 25)  # range dari quartil
variance = pd.Series(jumlah_kucing).var() # Persebaran
standar_deviation = pd.Series(jumlah_kucing).std()

# Mengukur Asymetric
plt.hist(jumlah_kucing, bins=4)
plt.show() # Mengshow plot
skewness = pd.Series(jumlah_kucing).skew()

print(f"rata_rata : {rata_rata}")
print(f"median : {median}")
print(f"mode : {mode}")
print(f"range : {range}")
print(f"iqr : {iqr}")
print(f"variance : {variance}")
print(f"standar_deviation : {standar_deviation}")
print(f"skewness : {skewness}")