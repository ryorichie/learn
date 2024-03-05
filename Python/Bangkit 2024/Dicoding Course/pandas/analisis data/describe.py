import pandas as pd
import matplotlib as mpl
 
city_names = ['Jakarta', 'Bandung', 'Makassar', 'Surabaya', 'Medan', 'Yogyakarta', 'Malang']
population = [498044, 964254, 491918, 8398748, 653115, 883305, 744955]
num_airports = [2, 2, 8, 3, 1, 3, 2]
 
df = pd.DataFrame({
  'City Name': city_names,
  'Population': population, 
  'Airports': num_airports,
})
 
print(df.describe(include="all"))
df.hist()
print(df.corr())