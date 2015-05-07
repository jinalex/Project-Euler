import math

def divisors(number):
    divisors= [1]

    for i in range(2,int(math.sqrt(number)+1)):
        if number%i == 0:
            divisors.append(i)
            divisors.append(number/i)

    return divisors

amicable = []

for a in range(2,10001):
    b = sum(divisors(a))
    if b>a and a == sum(divisors(b)):
        amicable.append(a)
        amicable.append(b)

print amicable
print sum(amicable)
