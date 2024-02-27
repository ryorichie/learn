import os
import datetime
print(os.path.getsize("spider.txt"))
time_stamp = os.path.getmtime("spider.txt") # print number of second since 1970
print(datetime.datetime.fromtimestamp(time_stamp))
print(os.path.abspath("spider.txt"))