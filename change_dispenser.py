#
# NAME
#    change_dispenser.py
#
# DESCRIPTION
#  This program prompts for a number from 0 to 99, and then outputs that number in quarters, dimes, nickles and pennies

# prompts user to enter a number to be converted
number = eval(input("Please enter a number between 0 to 99 to be converted into quarters, dimes and nickles: "))

#outputs conversion
print("Your change due is:")
print((number//25), "quarters,")
print((number //10), "dimes,")
print((number // 5), "nickles, and")
print((number // 1), "pennies.")
