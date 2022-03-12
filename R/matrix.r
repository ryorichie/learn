# We live on matrix world
matrix <- matrix(list(2, 3, 5, 7, 11, 13, 17, 19, "pantek"), nrow = 3, ncol = 3)

test1 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8), nrow = 2, ncol = 2)
# if you make less column and row needed, it cut your vector
test2 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8), nrow = 2)
# but when you set the row, it's automatically calculate the collumn to you
test3 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8))
# when you didn't set the row or column, you just make 1 column matrix