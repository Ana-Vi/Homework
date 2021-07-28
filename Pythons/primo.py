n= int(input("de 0 a 100: "))


if (n<0)
    print(("EU MANDEI DE 0 A 100 TROUXA .i."))
elif (n>100):
    print(("EU MANDEI DE 0 A 100 TROUXA .i."))
else:
    divisores= 0
    for divisor in range(1, n):
        if n%divisor==0:
            divisores = divisores + 1
            if divisores > 1:
                break
    if divisores > 1:
        print("não é primo")
    else:
        print("é primo")
        
