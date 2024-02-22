import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from scipy import stats

jumlah_kucing = np.array([3,1,2,4,2,2,1,2,3,2,1,2,2,3])
rata_rata = np.mean(jumlah_kucing)
median = np.median(jumlah_kucing)
mode = stats.mode(jumlah_kucing)[0]
range = max(jumlah_kucing) - min(jumlah_kucing)
iqr = np.percentile(jumlah_kucing, 75) - np.percentile(jumlah_kucing, 25)
variance = pd.Series(jumlah_kucing).var()
standar_deviation = pd.Series(jumlah_kucing).std()
plt.hist(jumlah_kucing, bins=4)
plt.show()
skewness = pd.Series(jumlah_kucing).skew()

print(rata_rata)
print(median)
print(mode)
print(range)
print(variance)
print(skewness)