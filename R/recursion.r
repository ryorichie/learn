tri_rekursi <- function(k) {
    if (k > 0) {
        result <- k + tri_rekursi(k - 1) #
        # nilai pada baris diatas tak akan disimpan di variabel resul
        # sehingga saat kita mengetik result setelahn menjalankan fungsi ini
        # tidak akan terjadi apa-apa
        print(result)
    } else {
       result <- 0
       return(result)
    }
}
 x <- tri_rekursi(6)