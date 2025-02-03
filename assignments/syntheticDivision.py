import numpy as np
import time
from numpy.polynomial import Polynomial

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


def synDiv(div, deg):
    b = Polynomial(for i in range (1, deg+1, 1))
    return(b)

print("------------------------------------------------------------")
print()
print("Evaluation Method: Obvious Evaluation")
print()
print("------------------------------------------------------------")
print()
for j in range(10, 21):
    print("Degree " + str(j) + ": " + str(obvEx(6, j)[0]) + "     Time: " + str(obvEx(6, j)[1]) + "ns")
print()
print("------------------------------------------------------------")
print()
print("Evaluation Method: Synthetic Division")
print()
print("------------------------------------------------------------")
print()
for j in range(10, 21):
    print("Degree ")

print(synDiv(6, 5))