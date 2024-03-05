import matplotlib.pyplot as plt
import seaborn as sns
import pandas as pd
 

lemon_diameter = [6.44, 6.87, 7.7, 8.85, 8.15, 
                  9.96, 7.21, 10.04, 10.2, 11.06]
lemon_weight = [112.05, 114.58, 116.71, 117.4, 128.93, 
                132.93, 138.92, 145.98, 148.44, 152.81]
 
plt.scatter(x=lemon_diameter, y=lemon_weight)
plt.show()
sns.regplot(x=lemon_diameter, y=lemon_weight)
plt.show()

penguins_df = sns.load_dataset("penguins")
 
sns.scatterplot(data=penguins_df, x="body_mass_g", y="flipper_length_mm", hue="species", style="species")
plt.show()

adelie_df = penguins_df[penguins_df.species == "Adelie"]
chinstrap_df = penguins_df[penguins_df.species == "Chinstrap"]
gentoo_df = penguins_df[penguins_df.species == "Gentoo"]

plt.figure(figsize=(10, 5))
sns.scatterplot(data=adelie_df, x="body_mass_g", y="flipper_length_mm", facecolor="lightgrey", label="Adelie")
sns.scatterplot(data=chinstrap_df, x="body_mass_g", y="flipper_length_mm", facecolor="lightgrey", label="Chinstrap")
sns.scatterplot(data=gentoo_df, x="body_mass_g", y="flipper_length_mm", facecolor="blue", label="Gentoo")
plt.legend()
plt.show()