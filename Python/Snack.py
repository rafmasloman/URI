x, y = map(int, input().split(" "))

"""price = [4.00, 4.50, 5.00, 2.00, 1.50]

print("%.2f"%price[1])"""

if x == 3:
    print("Total: R$ %.2f"%(y*5.00))
elif x == 4:
    print("Total: R$ %.2f"%(y*2.00))
elif x == 2:                                 
   print("Total: R$ %.2f"%(y*4.50))
elif x == 1:
   print("Total: R$ %.2f"%(y*4.00))
elif x == 5:
   print("Total: R$ %.2f"%(y*1.50))
