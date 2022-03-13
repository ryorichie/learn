printing <- function(x) {
    cat("\n")
    cat(x)
    cat("\n")
}

printing("data frame created")
data_frame <- data.frame(
    besar_kuota = c(10, 20, 30),
    provider = c("IM3", "XL", "TELKOMSEL"),
    Durasi = c(30, 60, 90)
)

printing("Printing Data Frame")
print(data_frame)

printing(("printng Data Frame Summary"))
print(summary(data_frame))

# Adding new row
data_frame <- rbind(data_frame, c(25, "AXIS", 60))
printing("Added New Row")
print(data_frame)

# Adding new column
data_frame <- cbind(data_frame, Jenis = c("Siang", "Malam", "24 Jam", "Siang"))
printing("Added Now Column")
print(data_frame)

# Remove Rows and column
data_framenorowandcolumn <- data_frame[-c(1), -c(1, 2)]
printing("Removing column and row")
print(data_framenorowandcolumn)

# Printing Amount of rows and column
printing("Printing Amoung of rows and column")
print(dim(data_frame))

# Printing row and column number individually
printing("Printing row and column number individually")
cat("This is column")
print(ncol(data_frame))
cat("This is row")
print(nrow(data_frame))

# Printing Data Frame length, it's similar with ncol()
printing("Printing Data Frame Length")
print(length(data_frame))

# Combining Data Frame
# with rbind, you need same column title
printing("Combining Data Frame with rbind")
data_frame1 <- data.frame(
    besar_kuota = c(25, 30),
    provider = c("Smartfren", "Three"),
    Durasi = c(7, 20),
    Jenis = c("24 Jam", "Siang")
)
data_frame <- rbind(data_frame, data_frame1)
print(data_frame)

printing("Combining Data Frame with cbind")
data_frame2 <- data.frame(
    Stok = c(22, 12, 23, 21, 32, 21)
)
data_frame <- cbind(data_frame, data_frame2)
print(data_frame)