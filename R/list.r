buah <- list("apel taman eden", "durian", "jackfruit")
pasir <- list("pasir california", "pasir taiwan", "pasir rumah")
buah[1] <- "buah antu"

# print(length(buah))

# if(buah[1] == "buah antu") {
#     print("buah antu ada")s
# } else {
#    "buah buah antu tidak ada"
# } kode dibawah adalah alternatif simpel

# print("apel taman eden" %in% buah)
# print("buah antu" %in% buah) #check keberadaan value

buah <- append(buah, "gomu gomu no mi", after = 1)
# to add the item, reassign the value is needed
# print(buah)

buah <- buah[-1]
# you still need to reassign the value to remove value

# print((buah)[1:2])
# print certain value on the list

for (x in buah) {
    print(x)
}

# combo <- list(buah, pasir)
# code above didn't joint the list to one list, it just
# separated
combo <- c(buah, pasir)