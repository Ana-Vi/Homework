x= str(input("nome: "))
quantidade= int(input("qtd: "))
pu= float(input("pre�o unit�rio: "))
total= quantidade* pu
if quantidade<= 5:
    total= total*0.02
elif quantidade>5 and quantidade<=10:
    total= total*0.03
else:
    total= total*0.05
print("O pre�o do produto", x ,"� %.2f"%total)
    

