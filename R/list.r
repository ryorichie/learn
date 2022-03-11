buah <- list("apel taman eden", "durian", "jackfruit")

buah[1] <- "buah antu"
print(buah)
print(length(buah))

# if(buah[1] == "buah antu") {
#     print("buah antu ada")
# } else {
#    "buah buah antu tidak ada"
# } kode dibawah adalah alternatif simpel

print("apel taman eden" %in% buah)
print("buah antu" %in% buah)

buah <- append(buah, "gomu gomu no mi", after = 1)
# to add the item, reassign the value is needed
print(buah)

buah <- buah[-2]
# you still need to reassign the value to remove value