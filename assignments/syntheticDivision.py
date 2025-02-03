import numpy as np
import time
import pandas as pd
import xlsxwriter
from numpy.polynomial import Polynomial
prepDict = {"Degree": [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20], "Time (ns)": []}
def obvEx(x, deg):
    timeList = []
    for k in range(0, 100):
        
        start = time.perf_counter_ns()
        a = 0

        for i in range(0, deg+1, 1):

            a += pow(x, i)

        end = time.perf_counter_ns()
        timeList.append(end - start)
    return(a, np.mean(timeList), end - start)

def synDiv(div, deg):
    timeList = []
    for k in range(0, 100):

        start = time.perf_counter_ns()

        p = Polynomial([i for i in range (1, deg+1, 1)])

        a = p/div

        end = time.perf_counter_ns()

        timeList.append(end - start)
    return(a, np.mean(timeList), end - start)

def menu():
    x = int(input("Enter universal value of x: "))
    print("1. Obvious Evaluation")
    print("2. Synthetic Division")
    print("3. Exit")
    print()
    choice = int(input("Enter your choice: "))
    if choice == 1:
        pattt = r"C:\Users\jack\OneDrive - SC GSSM\datastrux\obvdata.xlsx"
        writer = pd.ExcelWriter("obvdata.xlsx", engine="xlsxwriter")
        for j in range(10, 21):
            timens = obvEx(x, j)[1]
            print("Degree " + str(j) + ": " + str(obvEx(x, j)[0]) + "     Time: " + str(timens) + "ns")
            prepDict["Time (ns)"].append(timens)
        dF = pd.DataFrame(prepDict)
        
        dF.to_excel(excel_writer=writer, sheet_name="Obvious Evaluation", index=False)
        writer.close()
        print("Excel file created, data outputted at "+ str(pattt))
    if choice == 2:
        pattt = r"C:\Users\jack\OneDrive - SC GSSM\datastrux\syndata.xlsx"
        writer = pd.ExcelWriter("syndata.xlsx", engine="xlsxwriter")
        for j in range(10, 21):
            timens = synDiv(x, j)[1]
            print("Degree " + str(j) + ": " + str(synDiv(x, j)[0]))
            prepDict["Time (ns)"].append(timens)
        for h in range(10, 21):
            print("Time: " + str(synDiv(x, h)[1]) + "ns")
        dF = pd.DataFrame(prepDict)
        
        dF.to_excel(excel_writer=writer, sheet_name="Synthetic Division", index=False)
        writer.close()
        print("Excel file created, data outputted at "+ str(pattt))
menu()