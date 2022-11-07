import math
#
# NAME
#   M8b.py
#
# DESCRIPTION
#   This code creates and defines a class called Ellipse 
#
# DATE
#   December, 02 2022
#
# PROGRAMMER
#   Victoria Aguilar
#   aguil113@canton.edu
#
#
class Ellipse:
    def __init__(self, major, minor):
        self.major = major
        self.minor = minor

    def area(self):
        return math.pi * self.major * self.minor

a = Ellipse(4, 2)

print(a.area())





