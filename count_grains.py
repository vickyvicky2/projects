#
# NAME
#    count_grains.py
#
# DESCRIPTION
#  This program uses a for loop to calculate the answer to the wheat and chessboard problem


#variable for grains
grains = 1

#for loop with range starting with 1 and ending with 64
for i in range(1, 65):
    grains = grains*2

#output for total number of grains
print("The total number of grains of wheat on the chessboard would be:", grains)
 
