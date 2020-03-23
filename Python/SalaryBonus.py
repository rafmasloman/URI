employeName = input()
valueOne = input()
valueTwo = input()

sellerReceive = (float (valueTwo) * 15) / 100
totalSalary = float (valueOne) + sellerReceive

print("TOTAL = R$ %.2f" % totalSalary)