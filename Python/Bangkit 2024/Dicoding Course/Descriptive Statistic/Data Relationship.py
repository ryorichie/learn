import pandas as pd

# Correlation & CovarianceTable
sample_data = {
    "name": ["John", "Alia", "Ananya", "Steve", "Ben"],
    "age": [24, 22, 23, 25, 28],
    "communication_skill_score": [85, 70, 75, 90, 90],
    "quantitative_skill_score": [80, 90, 80, 75, 70],
}
df = pd.DataFrame(sample_data)

print(f"Tabel Correlation/n{df.corr(numeric_only=True)} /n Tabel Covariance/n {df.cov(numeric_only=True)}")