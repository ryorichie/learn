infinite_loop <- function(k) {
    k <- k - infinite_loop(1)
}

infinite_loop(1)

#fail