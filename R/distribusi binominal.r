table <- data.frame(Hasil = pbinom(1:20, size=20, prob = 0.5, lower.tail = TRUE))

plot(
    1:20,
    table$Hasil,
    xlab = "Number of Successes",
    ylab = "Cumultative Probality",
    main = "Binominal Distribution: Trials = 20, Prob. of success = 0.5",
    type = "l",
)
abline(h=0, col="gray")