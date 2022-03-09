fungsi_luar <- function(x) {
    #argumen kurung pertama akan dieksekusi sebagai x
  fungsi_dalam <- function(y) {
    #argumen kurung pertama akan dieksekusi sebagai y
    a <- x / y
    return(a)
  }
  return(fungsi_dalam)
}
output <- Fungsi_luar(3) # To call the Outer_func
output(5) # alternative dari Fungsi_luar(3)(5)

# pada Fungsi_luar(3)(5)
# 3 akan di eksekusi sebagai x
# 5 akan di eksekusi sebagai y