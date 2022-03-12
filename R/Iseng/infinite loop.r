r <- 1
while (r > 0) {
    while (r < 2000) {
        print(r)
        r <- r + 1
        if (r == 601) {
            break
        }
    }
    while (r > 0) {
        print(r)
        r <- r - 1
        if (r == 1) {
            break
        }
    }
}