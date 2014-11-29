def findPali ():
    ans = 0
    for a in range (900,1000):
        for b in range (a,1000):
            if str(a*b) == str(a*b)[::-1]:
                ans = max(a*b,ans)
    return ans

print findPali()
                
