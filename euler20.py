import math

number = str( math.factorial(100) )

total = 0

for i in number:
    total += int(i)

print total
