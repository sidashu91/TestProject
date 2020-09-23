'''
Created on 15-May-2020

@author: SIDDHARTH
'''

for x in range(4):
    for y in range(3):
        print(f'({x},{y})')
        
        
#numbers= [5,2,5,2,2]
numbers= [1,1,1,1,5] #prints L

for count_x in numbers:
    #print(count_x) 
    output=''
    for count in range(count_x):
        #print('Value of count :',count)
        output= output+'x'
    print(output)
