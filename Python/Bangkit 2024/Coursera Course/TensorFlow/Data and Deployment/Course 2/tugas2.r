# Class of 2022
score_2022 <- rnorm(n = 100, mean = 85, sd = 5)
sd_2022 <- sd(score_2022)

# Class of 2023
score_2023 <- rnorm(n = 100, mean = 75, sd = 6)
sd_2023 <- sd(score_2023)

# Coefficient of diversity
diversity_2022 <- sd_2022 / mean(score_2022)
diversity_2023 <- sd_2023 / mean(score_2023)

cat("Standar Deviasi SI Angkatan 2022 MK Pemrograman: ", diversity_2022, "\n")
cat("Standar Deviasi SI Angkatan 2023 MK Pemrograman: ", diversity_2023, "\n")
