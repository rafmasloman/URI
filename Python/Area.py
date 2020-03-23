import math

a,b,c = map(float, input().split(" "))

#A
areaTriangle = (a * c) / 2 
print("TRIANGULO: %.3f"%areaTriangle)

#B
areaCircle = math.pow(c, 2) * 3.14159
print("CIRCULO: %.3f"%areaCircle)

#C
areaTrapesium = ((a + b) * c) / 2
print("TRAPEZIO: %.3f"%areaTrapesium)

#D
areaSquare = math.pow(b, 2)
print("QUADRADO: %.3f"%areaSquare)

#E
areaRectangle = a * b
print("RETANGULO: %.3f"%areaRectangle)
