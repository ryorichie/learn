class Apple:
    def __init__(self, color, flavor) -> None:
        self.color = color
        self.flavor = flavor
    def __str__(self) -> str:
        return "an apple which is {} and {}".format(self.color, self.flavor)
        
honeycrisp = Apple("blue", "bitter")
print(honeycrisp)

class Jeruk:
    def initialize(color, flavor):
        warna = color
        rasa = flavor
        return "an orange which is {} and {}".format(color, flavor)
        
beecon = Jeruk.initialize("blue", "bitter")
print(beecon)

class Triangle:
    def __init__(self, base, height):
        self.base = base
        self.height = height
    def area(self):
        return 0.5 * self.base * self.height
    def __add__(self, other):
        return self.area() + other.area()
    
# Method Structure
# class ClassName:
#     def method_name(self, other_parameters):
#         body_of_method

check = 7 < "number"
triangle1 = Triangle(10, 5)
triangle2 = Triangle(6, 8)
print("The area of triangle 1 is", triangle1.area())
print("The area of triangle 2 is", triangle2.area())
print("The area of both triangles is", triangle1 + triangle2)