import time

start = time.time()

#Initialize variables
numStr = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"

tempAdj = []
largeAdj = [0,0,0,0,0,0,0,0,0,0,0,0,0]
i = 0

#Compares two lists to see which yields the greater product
def compare (array1, bigList):
        list1 = map(int,array1)
        list2 = bigList

        product1 = 1
        product2 = 1

        for n in list1:
                product1 = product1*n

        for n in list2:
                product2 = product2*n

        if product1 >= product2:
                return list1
        else:
                return bigList

while i < 989:
        char = numStr[i]
        #skips the arrays that include 0 because product will be 0
        while char == "0":
                i += 1
                char = numStr[i]
                tempAdj = []
        #adds to the array
        tempAdj.append(char)
        i += 1
        #once the array is full (13 consecutive digits) executes the comparison
        if len(tempAdj) == 13:         
                largeAdj = compare(tempAdj, largeAdj)
                #shifts pointer to the next number
                i = i-12
                tempAdj = []
                
print "THE ANSWER IS THE PRODUCT OF THIS ARRAY\n",largeAdj
answer = 1
for n in largeAdj:
                answer = answer*n
print "\nWHICH IS :",answer
print "\nThat took ",time.time()-start, "seconds!"
