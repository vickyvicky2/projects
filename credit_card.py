#
# NAME
#   credit_card.py
#
# DESCRIPTION
#   This program prompts for a credit card number and outputs the name of the brand.
#
# DATE
#   October, 26 2022
#
# PROGRAMMER
#   Victoria Aguilar
#   aguil113@canton.edu
#
#

#receives input card number from user
credit = input("What is the number of the credit card you want to know the brand of? ")

#sets conditions for a Visa card
if credit[0]=='4':
    print("The credit card number you entered is from a Visa card.")
#if card is not a visa card, elif will check for MasterCard and Discover
elif credit[0]=='5':
    print("The credit card number you entered is from a MasterCard.")
elif credit[0]=='6':
    print("The credit card number you entered is from a Discover card.")
#if none of the above conditions are met to find credit card brand, the program will output unknown
else:
    print("Unknown Card")
