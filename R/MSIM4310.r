# Install and load necessary libraries
install.packages("plotly")
install.packages("dplyr")
install.packages("DT")
library(plotly)
library(dplyr)
library(DT)

# Read the data from the Excel file
library(readxl)
file_path <- "DataSet Tugas 3- MSIM4310 (1).xls"
data <- read_excel(file_path, col_names = FALSE)

# Print the first few rows to check the data import
print(head(data))

# Rename columns
colnames(data) <- c("Date", "Min_Temperature", "Max_Temperature", "Average_Temperature", "Humidity", 
                    "Atmospheric_Pressure", "Wind_Speed", "Rain_Fall", "Sunshine_Duration")

# Print the renamed data to verify
print(head(data))

# Extract the necessary rows and columns
data_subset <- data[9:20, ]

# Print the extracted subset to verify
print(data_subset)

# Create a vector of month names
months <- c("January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December")

# Manually assign months to the subset
data_subset$Month <- months[1:12]

# Convert Month to a factor with the correct order
data_subset$Month <- factor(data_subset$Month, levels = months)

# Inspect the raw data before conversion
print(data_subset$Min_Temperature)

# Clean the data: Replace commas with periods and convert to numeric
min_temperature <- as.numeric(gsub(",", ".", data_subset$Min_Temperature))
max_temperature <- as.numeric(gsub(",", ".", data_subset$Max_Temperature))
average_temperature <- as.numeric(gsub(",", ".", data_subset$Average_Temperature))
humidity <- as.numeric(gsub(",", ".", data_subset$Humidity))
atmospheric_pressure <- as.numeric(gsub(",", ".", data_subset$Atmospheric_Pressure))
wind_speed <- as.numeric(gsub(",", ".", data_subset$Wind_Speed))
rain_fall <- as.numeric(gsub(",", ".", data_subset$Rain_Fall))
sunshine_duration <- as.numeric(gsub(",", ".", data_subset$Sunshine_Duration))

# Print the cleaned numeric values to check for issues
print(min_temperature)
print(max_temperature)
print(average_temperature)
print(humidity)
print(atmospheric_pressure)
print(wind_speed)
print(rain_fall)
print(sunshine_duration)

# Create a data frame for plotting
plot_data <- data.frame(
  Month = data_subset$Month,
  Min_Temperature = min_temperature,
  Max_Temperature = max_temperature,
  Average_Temperature = average_temperature,
  Humidity = humidity,
  Atmospheric_Pressure = atmospheric_pressure,
  Wind_Speed = wind_speed,
  Rain_Fall = rain_fall,
  Sunshine_Duration = sunshine_duration
)

# Create an interactive scatter plot
scatter_fig <- plot_ly(
  data = plot_data,
  x = ~Min_Temperature,
  y = ~Max_Temperature,
  type = 'scatter',
  mode = 'markers',
  marker = list(size = 10, color = 'rgba(255, 182, 193, .9)', line = list(color = 'rgba(152, 0, 0, .8)', width = 2)),
  text = ~paste('Month:', Month, '<br>Average Temp:', Average_Temperature, '<br>Humidity:', Humidity, '<br>Pressure:', Atmospheric_Pressure, '<br>Wind Speed:', Wind_Speed, '<br>Rainfall:', Rain_Fall, '<br>Sunshine Duration:', Sunshine_Duration)
) %>% layout(
  title = 'Interactive Scatter Plot',
  xaxis = list(title = 'Min Temperature'),
  yaxis = list(title = 'Max Temperature')
)

# Create an interactive line plot
line_fig <- plot_ly(
  data = plot_data,
  x = ~Month,
  y = ~Average_Temperature,
  type = 'scatter',
  mode = 'lines+markers',
  line = list(color = 'blue'),
  marker = list(size = 10, color = 'blue')
) %>% layout(
  title = 'Average Temperature Over Months',
  xaxis = list(title = 'Month'),
  yaxis = list(title = 'Average Temperature')
)

# Create an interactive bar plot
bar_fig <- plot_ly(
  data = plot_data,
  x = ~Month,
  y = ~Rain_Fall,
  type = 'bar',
  marker = list(color = 'rgba(255, 182, 193, .9)', line = list(color = 'rgba(152, 0, 0, .8)', width = 2))
) %>% layout(
  title = 'Rainfall Over Months',
  xaxis = list(title = 'Month'),
  yaxis = list(title = 'Rainfall')
)

# Create an interactive data table
datatable_fig <- datatable(plot_data, options = list(pageLength = 5))

# Print all plots and the table
print(scatter_fig)
print(line_fig)
print(bar_fig)
datatable_fig  # This should be displayed in the RStudio Viewer or an appropriate HTML output

