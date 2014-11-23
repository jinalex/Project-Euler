import random
import math

def primeCheck (num,k):
    prime = False
    for i in range(k):
        a = random.randint(2, int (num**(0.5)))
        b = a**(num-1)
        if (b % num) == 1:
            prime = True
        else:
            prime = False
    return prime

theThing = 600851475143
bigPrime = 0

for i in range(3,int(math.sqrt(theThing)),2):
    if theThing%i == 0:
        if primeCheck(i,1) and i > bigPrime:
            bigPrime = i

print "The answer: ",bigPrime



