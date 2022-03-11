repeat_each <- rep(c(1, 3, 5), each = 10) # repeat each value
repeat_times <- rep(c(1, 3, 5), times = 3)
repeat_independen <- rep(c(1, 3, 5), times = c(2, 4, 6))

print(repeat_each)
# [1] 1 1 1 1 1 1 1 1 1 1 3 3 3 3 3 3 3 3 3 3 5 5 5 5 5 5 5 5 5 5
print(repeat_times)
# [1]  1 10 20  1 10 20  1 10 20
print(repeat_independen)
# [1] 1 1 3 3 3 3 5 5 5 5 5 5