from pip._vendor.urllib3.fields import guess_content_type


secret_numer= 9
guess_count=0
guess_limit =3

while guess_count < guess_limit:
    guess= int(input('Guess     : '))
    guess_count += 1  
    
if guess == secret_numer :
    print('you won')
else:
    print("you failed sorry")
    

       
    
     
    