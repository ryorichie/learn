numbers1 <- 1.5:6.5
numbers2 <- 1.5:7.5
numbers <- 10:100
numbers3 <- c(12, 3, 13, 213, 123, 123, 3, 3, 2, 13, 1, 3, 13, 2)
log_values <- c(TRUE, FALSE, TRUE, FALSE, FALSE, FALSE, TRUE)

fruits <- c("banana", "jackfruit", "durian")

print(fruits[c(3)]) # acessing certain value
log_values[c(1)] <- FALSE # change value of a vector

# print(log_values) # nolint
# print(numbers1) # nolint
# print(numbers2) # nolint
# print(fruits) # nolint
# print(numbers[22]) # nolint

numbers3 <- seq(from = 0, by = 0.1, to = 300) #may not be sorted
print(numbers3)