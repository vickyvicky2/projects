import math
#
#   This code creates and defines a class called Ellipse and it calculates the area of an Ellipse with a major axis of 4 and minor axis of 2
#
class Ellipse:
    def __init__(self, major, minor):
        self.major = major
        self.minor = minor

    def area(self):
        return math.pi * self.major * self.minor

a = Ellipse(4, 2)

print(a.area())





