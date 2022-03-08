x <- 9

    if (x > 10) {
        print("Above ten")
        if (x > 20) {
            print("and also above 20!")
            print(paste("It's", x))
        } else {
            print("but not above 20")
            print(paste("It's", x))
        }
        x
    } else {
        print("below 10.")
        print(paste("It's", x))
    }