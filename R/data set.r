printing <- function(x) {
    cat("\n")
    if (class(x) == "character") {
        cat(x)
        cat("\n")
    } else {
        print(x)
        cat("\n")
    }
}

printing("print mtcars dataset")
print(mtcars)
Data_Cars <- mtcars

printing("Print dimension and variable name")
print(dim(Data_Cars))
print(names(Data_Cars))

printing("Print rownames")
print(rownames(Data_Cars))

printing("Sorting Data Cars")
Cylinder_data <- sort(Data_Cars$cyl)
print(Cylinder_data)

printing("Printing summary")
print(summary(Data_Cars))

printing("FInd largest and smallest value in HP")
print(max(Data_Cars$hp))
print(min(Data_Cars$hp))

printing("Find index position of min and max value")
print(which.max(Data_Cars$hp))
print(which.min(Data_Cars$hp))

printing("combine which function with rownames")
print(rownames(Data_Cars)[which.max(Data_Cars$hp)])
print(rownames(Data_Cars)[which.min(Data_Cars$hp)])

printing("Mean")
print(mean(Data_Cars$wt))

printing("Median")
print(median(Data_Cars$wt))

printing("Modus")
print(names(sort(-table(Data_Cars$wt)))[1])

printing("Percentiles or Quartiles")
print(quantile(Data_Cars$wt, c(0.75, 0.2)))