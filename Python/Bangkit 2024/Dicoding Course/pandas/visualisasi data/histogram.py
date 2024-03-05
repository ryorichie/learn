import matplotlib.pyplot as plt
import numpy as np
import seaborn as sns

x = np.random.normal(15, 5, 250)
 
plt.hist(x=x, bins=15)
plt.show()
sns.histplot(x=x, bins=15, kde=True)
plt.show()