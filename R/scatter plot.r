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
# survey 1
x <- c(2, 1, 4, 13, 1, 3, 13, 3, 13, 1, 11, 12)
y <- c(67, 64, 75, 97, 44, 57, 76, 67, 55, 56, 76, 81)
# survey 2
x1 <- c(2, 3, 4, 12, 16, 12, 12, 12, 1, 4, 9, 8)
y1 <- c(94, 83, 95, 68, 58, 69, 59, 50, 50, 60, 59, 49)
plot(
    x, y,
    main = "Weeb level",
    ylab = "stage",
    xlab = "hentai watched",
    col = "red",
    cex = 2,
)

points(x1, y1, col = "blue", cex = 2)