import math

x1, y1 = map(float, input().split(" "))
x2, y2 = map(float, input().split(" "))


pengurangan1 = float (x2) - float (x1)
pengurangan2 = float (y2) - float (y1)

distance = math.pow(pengurangan1, 2) + math.pow(pengurangan2, 2)

print("%.4f" % math.sqrt(distance))
