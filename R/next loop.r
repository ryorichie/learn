i <- 0
while (i < 20) {
    print(i)
    i <- i + 1
    if (i == 18) {
        next
    }
    print(i * i)
    print(i)
}