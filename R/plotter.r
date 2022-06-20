data_frame <- data.frame(
    No = c(1,2,3,4),
    Penjualan = c("Minyak Sayur", "Beras", "Terigu", "Kecap"),
    Persentase = c(32.4, 37.0, 21.3, 9.3)
)


# making barplot
barplot(
    data_frame$Persentase,
    names.arg = data_frame$Penjualan,
    main = "Penjualan",
    col = "green",
    horiz = TRUE,
    ylab = "Barang"
)

color <- c("red", "chartreuse", "cadetblue1", "blueviolet")

# Making pie chart
pie(
    data_frame$Persentase,
    data_frame$Persentase,
    main = "Penjualan",
    col = color
)

# Display explenation box
legend(
    "topright",
    data_frame$Penjualan,
    fill = color
)