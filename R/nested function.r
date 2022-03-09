kali <- "kali"
bagi <- "bagi"
tambah <- "tambah"
kurang <- "kurang"

hitung <- function (number1, operasi, number2) {
    if (operasi == "kali") {
        return(number1 * number2)
    }else if(operasi == "bagi") {
        return(number1/number2)
    }else if(operasi == "tambah") {
        return(number1+number2)
    } else if(operasi == "kurang") {
        return(number1-number2)
    }
}

hitung(hitung(20, tambah, 20), kali, hitung(13, bagi, 3))