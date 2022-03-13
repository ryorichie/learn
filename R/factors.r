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
# creating factors
anime_genre <- factor(c(
    "Drama", "Yaoi", "Yuri", "Drama", "Gender Bender",
    "Yaoi", "Gender Bender", "Yuri", "Yuri", "Hentai"
), levels = c("Drama", "Gender Bender", "Yaoi", "Yuri", "Action"))

# printing factors
printing("printing anime_genre")
print(anime_genre)

printing("printing anime_genre level")
print(levels(anime_genre))

printing("Factor Lengsth")
print(length(anime_genre))

printing("Acessing Factors")
print(anime_genre[2])

#changing item value
anime_genre[10] <- "Yaoi"

