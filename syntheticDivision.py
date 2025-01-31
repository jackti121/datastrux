import numpy as np
import time
def obvEx(x, deg):
    start = time.time_ns()
    a = 0
    for i in range(0, deg+1, 1):
        a += pow(x, i)
    end = time.time_ns()
    return (a, end-start)

print(obvEx(6, 20))
for j in range(10, 21):
    print("Degree " + str(j) + ": " + str(obvEx(6, j)[0]) + "     Time: " + str(obvEx(6, j)[1]) + "ns")
print(obvEx(6, 20)[1])