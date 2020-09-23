'''
Created on 15-May-2020

@author: SIDDHARTH
'''

for x in 'Python':
    print(x)
    
for item in ['Mosh', 'Josh', 'Sara', 'Johnson']:
    print(item)
    
    
 #Range Function:
for item in range(10):  
    print(item)   #Prints from 0 to 9

for item in range(2,10,2):
    print('Prints from 2 with a diffrence of 2 numbers\n',item)    

prices=[10, 20,30]
total=0
for price in prices:
    total= total+price   
print(f'Total is : {total}')