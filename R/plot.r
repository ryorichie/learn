printing <- function(x) {
    cat("\n")
    if (class(x) == "character") {
        cat(x)
        cat("\n")
    } else {
        print(x)
        cat("\n")
    }
}

# Making Plot
# plot2 <- plot(1,3)

# Making 2 Point plot
# plot1 <- plot(c(1,8), c(3,10))

# Making Multiple Point plot
# plot(c(1:5), c(2, 3, 5, 7, 11))

# How to organize your plot
x <- c(1:5)
y <- c(2, 3, 5, 7, 11)

# plot(x, y, type = "l") #that's small L, not Big i or 1

# sequence plot
# plot(1:10)

# plot labels and other
plot(
    1:10,
    main = "Graphku", # judul
    xlab = "x axis", # judul x
    ylab = "y axie", # judul y
    # type = "l", #untuk membuat garis
    col = "blue", # warna border simbol
    cex = 5, # besar simbol
    pch = 11, # determine shape
)