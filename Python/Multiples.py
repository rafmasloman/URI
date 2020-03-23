number,number2 = map(int, input().split(" "))

if (number2 % number) == 0 or (number % number2) == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")

