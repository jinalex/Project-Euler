def fib (n):
    array = []
    a, b = 1, 1
    while a < n:
        if a%2 == 0:
            array.append(a)
        a, b = b, a+b
    return array

result = 0
n = 4000000

for i in fib(n):
    result = result + i

print result


