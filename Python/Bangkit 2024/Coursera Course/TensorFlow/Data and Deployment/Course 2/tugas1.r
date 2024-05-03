# Previous generation:
age <- c(rep(18, 257), rep(23, 73), rep(28, 73), rep(33, 73))

# Age Range
age_range <- c("(18-22)", "(23-27)", "(28-32)", "(33-37)")

# Frequency for each age range

barplot(table(age), names.arg = age_range, main = "Age Distribution", xlab = "Age", ylab = "Frequency")
