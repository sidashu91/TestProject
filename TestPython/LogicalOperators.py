
#if applicant  has high income AND good credit > eligible for loan

has_high_income= False
has_good_credit =True

if has_high_income and has_good_credit:
    print('****** AND Operator *****')
    print('Eligible for loan')
else:
    print('Using AND operator the condition is not True\n')

if has_high_income or has_good_credit:
    print('******OR Operator *****')
    print('Eligible for loan')


    #NOT Operator:
    #if applicant has good credit and does not have a criminal record
    print("Checking NOT operator:")
has_good_credits = True
has_criminal_record = True
if has_good_credits and not has_criminal_record:
    print("Not a criminal and has good credit : Eligible for Loan")
else:
    print("Not Eligible since its either not good with credits or is a criminal")