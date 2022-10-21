#
# NAME
#   grade_calculation.py
#
# DESCRIPTION
#   This program uses a decision structure to calculate a grade using an exam score input

# asks user to enter grade
grade = eval(input("Please enter your exam score to receive your corresponding grade: "))

# checks conditions to determine a grade
if grade >= 90:
    print("Your calculated grade of", grade, "is 'A'" )

elif grade >= 80:
    print("Your calculated grade of", grade, "is 'B'")

elif grade >= 70:
    print("Your calculated grade of", grade, "is 'C'")

elif grade >= 60:
    print("Your calculated grade of", grade, "is 'D'")

#outputs F when none of the conditions for a higher grade are met
else:
    print("Your calculated grade of", grade, " is 'F'")
