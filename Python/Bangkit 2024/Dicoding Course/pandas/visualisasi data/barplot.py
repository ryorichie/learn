import matplotlib.pyplot as plt
import pandas as pd
import seaborn as sns
 
cities = ('Bogor', 'Bandung', 'Jakarta', 'Semarang', 'Yogyakarta', 
          'Surakarta','Surabaya', 'Medan', 'Makassar')
 
populations = (45076704, 11626410, 212162757, 19109629, 50819826, 17579085,
               3481, 287750, 785409)
 
plt.bar(x=cities, height=populations) # vertical bar
plt.xticks(rotation=45)
plt.show()

plt.barh(y=cities, width=populations) # horizontal bar
plt.show()

df = pd.DataFrame({
    'Cities': cities,
    'Population': populations,
})

df.sort_values(by='Population', inplace=True)
plt.barh(y=df['Cities'], width=df['Population']) # horizontal bar
plt.xlabel("Population (Millions)")
plt.title("Population of Cities in Indonesia")
plt.show()

sns.barplot(y=df["Cities"], x=df["Population"], orient="h", color='yellow')
plt.xlabel("Population (Millions)")
plt.title("Population of Cities in Indonesia")
plt.show()

penguins = sns.load_dataset("penguins")
 
sns.barplot(data=penguins, x="species", y="body_mass_g", hue="sex", errorbar=None)
plt.show()