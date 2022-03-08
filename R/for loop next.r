shit <- list("tom shit", "golep shit", "sama shit", "my shit", "anjing shit")
for (x in shit) {
    if (x == "my shit") {
        next
    }
    print(x)
}