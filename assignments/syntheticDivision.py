import numpy as np
import time


def obvEx(x, deg):
    timeList = []
    for k in range(0, 100):

        start = time.perf_counter_ns()
        a = 0

        for i in range(0, deg+1, 1):

            a += pow(x, i)

        end = time.perf_counter_ns()
        timeList.append(end - start)
    return(a, np.mean(timeList))



for j in range(10, 21):
    print("Degree " + str(j) + ": " + str(obvEx(6, j)[0]) + "     Time: " + str(obvEx(6, j)[1]) + "ns")

