x <- c(10:30)

png(file ="timeSeries.png")

library(lubridate)

mts <- ts(x, start = decimal_date(ymd("2020-01-01")),
							frequency = 12)

# plotting the graph
plot(mts, xlab ="Monthly Data",
		ylab ="Stat",
		main ="Data",
		col.main ="darkgreen")

