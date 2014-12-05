def sumSquares (endNum):
    sum = 0
    for x in range (1,endNum+1):
        sum += x**2
    return sum

def squareSums (endNum):
    sum = 0
    for x in range (1,endNum+1):
        sum += x
    return sum**2

print squareSums(100) - sumSquares(100)
