x= str(input("nome: "))
quantidade= int(input("qtd: "))
pu= float(input("preço unitário: "))
total= quantidade* pu
if quantidade<= 5:
    total= total*0.02
elif quantidade>5 and quantidade<=10:
    total= total*0.03
else:
    total= total*0.05
print("O preço do produto", x ,"é %.2f"%total)
    

