#problem 17

digits = ["","one","two","three","four","five","six","seven","eight","nine"]
oneties = ["ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"]
tens = ['','','twenty','thirty','forty','fifty','sixty','seventy','eighty','ninety']
specials = ['and','hundred']

#convert strings to number of letters
def strArrayLen (array):
	lenArray = []
	for word in array:
		lenArray.append(len(word))
	return lenArray

#recursive increment
def letterCount(x):
	if x < 10:
		return (digitsLen[x])
	elif x < 20:
		return onetiesLen[x%10]
	elif x < 100:
		return tensLen[x/10] + letterCount(x%10)
	elif x < 1000:
		if x%100==0:
			return digitsLen[x/100] + specialLetters - 3
		else:
			return digitsLen[x/100] + specialLetters + letterCount(x%100)
	else:
		return len('onethousand')

#initiate arrays for str length
digitsLen = strArrayLen(digits)
onetiesLen = strArrayLen(oneties)
specialsLen = strArrayLen(specials)
tensLen = strArrayLen(tens)

specialLetters = sum(specialsLen)

numLetters = 0

for x in range(1,1001):
	numLetters += letterCount(x)
	#print "x: "+str(x)+" total: "+str(numLetters)

print numLetters