buah <- list("apel taman eden", "durian", "jackfruit")
pasir <- list("pasir california", "pasir taiwan", "pasir rumah")
buah[1] <- "buah antu"

# print(length(buah)) # nolint

# if(buah[1] == "buah antu") {
#     print("buah antu ada")s
# } else {
#    "buah buah antu tidak ada"
# } kode dibawah adalah alternatif simpel

# print("apel taman eden" %in% buah) # nolint
# print("buah antu" %in% buah) #check keberadaan value # nolint

buah <- append(buah, "gomu gomu no mi", after = 1)
# to add the item, reassign the value is needed
# print(buah) # nolint

buah <- buah[-1]
# you still need to reassign the value to remove value

# print((buah)[1:2]) # nolint # nolint
# print certain value on the list

for (x in buah) {
    print(x)
}

# combo <- list(buah, pasir) # nolint
# code above didn't joint the list to one list, it just
# separated
combo <- c(buah, pasir)