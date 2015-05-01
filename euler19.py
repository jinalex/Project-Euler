weekdays = ['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday','Sunday']
month_mod = [3,0,3,2,3,2,3,3,2,3,2,3]

count = 0
day = 2

for i in range(0,100):
    for j in range (0,12):
        temp = month_mod
        
        if i%4 == 0:
            temp[1] = 1
       
        day += temp[j]

        if day > 6:
            day = day%7

        if day==0:
            count+=1

print count


