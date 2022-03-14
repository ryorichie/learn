# Makng line
line1 <- 1:10
line2 <- c(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)

plot(
    line1, 
    type = "l", # garis
    col = "blue", # warna
    lwd = 3, # ketebalan
    lty = 6 # jenis
)

#you need to call plot first to add line
lines(
    line2,
    type = "l",
    col = "black",
)