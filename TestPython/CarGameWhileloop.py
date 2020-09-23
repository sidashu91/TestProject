'''
Created on 14-May-2020

@author: SIDDHARTH
'''


command =""
started=False
while True:
    command= input("> ").lower()
    if command=="start":
        if started:
            print("Car is Already Started")
        else:
            started=True
            print(" Car Started.........")
            
    elif command=="stop":
        if not started:
            print("Car is already Stopped")
        else:
            stated= False
        print("Car Stopped.....")
    elif command=="help":
        print("""
Start - Start the Car
Stop -  Stop the car
Quit - quit the game
                  """)
    elif command=="quit":
        break
    else:
        print("Sorry I do not Understand that")
