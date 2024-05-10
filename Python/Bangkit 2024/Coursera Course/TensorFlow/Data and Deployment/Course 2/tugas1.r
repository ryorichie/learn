# Previous generation:
age <- c(rep(18, 257), rep(23, 73), rep(28, 103), rep(33, 15), rep(38, 36), rep(43, 14), rep(48, 2))

# Age Range
age_range <- c("(18-22)", "(23-27)", "(28-32)", "(33-37)", "(38-42)", "(43-47)", "(48-52)")

ages <- table(age)

# barplot version
barplot(ages, names.arg = age_range, main = "Age Distribution", xlab = "Age", ylab = "Frequency")

# polygon plot version
polygon(age_range, ages, col = rainbow(length(age_range)),
        xlim = c(18, 52), ylim = c(0, max(ages)),
        main = "Age Distribution", xlab = "Age")


# Calculate mean, median, and modus
mean_age <- mean(age)
median_age <- median(age)
modus_age <- names(which.max(ages))

cat("Mean age: ", mean_age, "\n")
cat("Median age: ", median_age, "\n")
cat("Modus age: ", modus_age, "\n")
