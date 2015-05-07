import re

f = open('names.txt','r')

string = f.read().strip().replace('\"','')

names = re.split(',',string)

names.sort()

total = 0

for word in names:
    temp = 0
    for i in range(0,len(word)):
        temp += ord(word[i])-64
    total += (temp*(names.index(word)+1))

print total
