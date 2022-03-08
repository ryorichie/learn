roll <- function(){
    dice <- floor(runif(1, min = 1, max = 7))
        if (dice < 6) {
        print(paste("Unlucky, you get", dice))
    } else {
        print(paste("Luck you get", dice))
    }
}
