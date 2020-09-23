weight = int(input("Enter The Weight :"))
unit = input("(L)bs or Kgs :")

if unit.upper() == "L":
    converted = weight * 0.45
print(f' You Are : {converted} Kilos')

else:
converted = weight/0.45
print(f"You are  {converted } Pounds")
