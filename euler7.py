
n = 200000

primeArray = [True] * n

primeArray[0] = primeArray[1] = False

for (index, isPrime) in enumerate(primeArray):
    if isPrime:
        i = index
        for j in xrange(i*2, n, i):
                primeArray[j] = False

primes = [i for i, prime in enumerate(primeArray) if prime]

print primes[10001-1]
