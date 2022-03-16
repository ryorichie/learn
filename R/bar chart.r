# x-axis values
x <- c("Weebs", "Kpopers", "Boomer", "Normal")

# y-axie values
y <- c(2, 3, 5, 7)

barplot(
    y,
    names.arg = x, #nama tiap bar
    col = c("blue", "red", "black", "white"), #warna
    density = 5, #kerapatan warna
    width = c(1, 2, 2, 1), #ketebalan bar
    horiz = TRUE # bentuk bar
)