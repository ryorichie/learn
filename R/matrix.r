printing <- function(x) {
    cat("\n")
    cat(x)
    cat("\n")
}
# We live on matrix world
matrix <- matrix(c(2, 3, 5, 7, 11, 13, 17, 19, 23), nrow = 3, ncol = 3)

test1 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8), nrow = 2, ncol = 2)
# if you make less column and row needed, it cut your vector
test2 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8), nrow = 2)
# but when you set the row, it's automatically calculate the collumn to you
test3 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8))
# when you didn't set the row or column, you just make 1 column matrix

# acessing matrix
printing("accessing column")
print(matrix[3, ])
printing("accessing row")
print(matrix[, 3])
printing("accessing multiple row")
print(matrix[c(2, 3), ])
printing("acessing multiple column")
print(matrix[, c(2, 3)])

# add rows and columns
matrix <- cbind(matrix, c(29, 31, 37))
matrix <- rbind(matrix, c(1, 2, 3, 4))

# removing rows and columns
matrix <- matrix[-c(4), ]
# matrix <- matrix[-1] # this code delete first var
# and change matrix become a list

printing("item checking")
print(31 %in% matrix)

printing("check number row and column")
print(dim(matrix))
printing("check the length of the matrix")
print(length(matrix))

printing("Loop Through Matrix")

for (rows in 1:nrow(matrix)) {
    for (columns in 1:ncol(matrix)) {
        for (rows1 in 1:nrow(matrix)) {
            for (columns1 in 1:ncol(matrix)) {
                times_all_matrix <- matrix[rows, columns] * matrix[rows1, columns1]
                print(paste(matrix[rows, columns], "X", matrix[rows1, columns1], "=", times_all_matrix))
            }
        }
    }
}

printing("combining 2 matrix")
matrix1 <- matrix(c(41, 43, 47), nrow = 3)
matrix <- cbind(matrix,matrix1)
# matrix <- rbind(matrix,matrix1)
print(matrix)