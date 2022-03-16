# Create a pie vector
x <- c(15,15,25,45)
y <- c("weeb", "kpopers", "boomer", "normal")
color <- c("blue", "pink", "black", "white")

# displaying pie chart
pie(
    x,
    init.angle = 90, #star pie at 90 degree angle
    label = y,
    main = "Persentase Weeb",
    col = color
)

# Display explenation box
legend(
    "center",
    y,
    fill = color
)