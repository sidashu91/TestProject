import math
# print("Hello World")
# print('*'*10 )
# Birth_year = input('Enter the Birth Year ')
# print(type(Birth_year))
# Age= 2020 - int(Birth_year)
# print("Age is :")
# print(type(Age))

"""Type Conversion """
#Program to convert Pounds into Kgs:
from itertools import count, repeat

from pip._vendor.requests.auth import CONTENT_TYPE_FORM_URLENCODED

# Weight_Lbs = input('Enter  Weight In Lbs')
# #Weight_Kgs = Weight_Lbs * 0.45   #gives Error
# Weight_Kgs = int(Weight_Lbs) * 0.45
# print('Weight in Kgs : ', Weight_Kgs)  #prints String and Weight (Int)

"""Strings """
## print('Python's Course for Beginers') # gives error
print("Python's Course for Beginers")
print('Python for "beginers"')
course= '''Hi John 
          thanks for your Support to the team 
          
          regards,
          Siddharth Chaturvedi
'''

print(course)
course = 'Python for beginers'
print(course[0]) #first Char
print(course[-1]) # last char
print(course[0:3]) # starts from char 1 at index 0 to third character i.e t
print(course[0:]) # starts from index 0 ie first char to all the chars in str
print(course[:5]) #Assumes 0  for starting index  ie first char of str till 5 th char
print(course[:]) #Assumes 0  for starting index  ie first char of str till str length
another = 'Python  is  for beginers'
another=(course[:])
print(course)
print(course[:-1]) # prints from 0 index of begining till sexond last char from end

#String

first= 'john'
last = 'Smith'
messsage = first + '[' + last + '] is a coder'
print(messsage)

#Formatted Strings
msg= f'{first} [{last}] is a coder'
print(msg)

#StringMethods:
course= 'Python for Beginers'
print(len(course))

print(course.upper()) # print in upper case
print(course.lower())
print(course.find('P'))
print(course.find('o')) #finds index of lowe case o
print(course.find('O'))  # we ger -1 as we dont have upper case O here
print(course.find('Beginers')) #index where Word 'Beginers' begins i.e index 11
print(course.replace('Beginers','Absolute beginers')) #replaces the string, its case sensitive
print('Python' in course )# produces a boolean value and checkes whether the given string is present in the str > true
print('python' in course )

'''
Functions :
len()
upper()
lower()
title()
find()
replace()
in operator'''

'''
Arithmetic Operator:
+, -, /,// , %
'''
#Operators:
print(10/3) # we get floating point number, returns the quotent
print(10//3) # we get integer
print(10%3)  #prints remainder
print(10**3) #exponent or power

#Non Augmented operators
x=10
x=x+3
print(x)
#Augmented:
x=10
x+=3 #denotes x=x+3
x-=3 #x=x-3
print(x)


#Operator precedence:
x=10+3*2 # Multiplication is run first then add so result would be 3*2 then plus 10 i.e 16
#Exponent > Mult> Div> Add> Sub

x=(2+3)*10-3 #paranthesis are considered first
print(x)

#Math functions":
x=2.9
print(round(x))
print(abs(-2.9))

#Import math
#refer Python 3 math module

print(math.ceil(2.9))
print(math.floor(2.9))

#if Statements

is_hot = False
is_cold = False

if is_hot:
    print("It is a hot day")
    print("Drink lots of water")
    print("Enjoy your day ")

elif is_cold:
    print("Its a cold day")
    print("Wear  warm clothes")

else:
    print("Its is a lovely Day")
    print("Enjoy your day")



