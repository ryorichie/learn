# teks <- "warbyasah"
# my_function <- function() {
#     teks = "booyah" <-- Booyah stil not a global value
#     paste("R is", teks)
# }
#  my_function()

#  teks
teks <- "warbyasah"
global <- function() {
    teks <<- 'booyah' #Booyah jadi global value
    paste("R is", teks)
}

print(global())
print(teks)