printing <- function(x) {
    cat("\n")
    cat(x)
    cat("\n")
}

printing("making array")
array <- c(1:24)
printing("making 2D array")
array_2d <- array(array, dim = c(4, 3, 2))
print(array_2d)

# In the example above we create an array with the values 1 to 24.

# How does dim=c(4,3,2) work?
# The first and second number in the bracket
# specifies the amount of rows and columns.
# The last number in the bracket specifies
# how many dimensions we want.

# Note: Arrays can only have one data type.

printing("acessing array")
print(array_2d[2, 3, 1])

printing("acessing column")
print(array_2d[, c(1), 1])

printing("acessing multiple row")
print(array_2d[c(1,3), , 1])

printing("check item existance")
print(24 %in% array_2d)

printing("find row and column amount of array")
print(dim(array_2d))

printing("use length() function to know array length")
print(length(array_2d))

printing("loop through an array")
for(x in array_2d) {
    print(x)
    # for(y in array_2d) {
    #     print(x*y)
    # }
}