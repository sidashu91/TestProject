# Example:
price = 1000
has_good_credit = True

if has_good_credit:
    down_payment = 0.1 * price
    print(F"Down payment is : ${down_payment}")

else:
    down_payment = 0.2 * price
print(F"Down payment is : ${down_payment}")