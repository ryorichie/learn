data_frame <- data.frame(
    prodi = c(rep(c("Matematika", "Statistika", "Biologi"), times = 6)),
    asal_daerah = c(rep(rep(c("Jakarta", "Bogor", "Bandung"), times = c(3, 3, 3)), times = 2)),
    usia = c(rep(c(22), each = 9), (rep(c(26), each = 9)))
)

print(data_frame)