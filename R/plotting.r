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

plot <- plot(1, 3)
print(plot)

plot1 <- plot(c(1,8), c(3,10))
print(plot1)