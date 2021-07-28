qtd= 0
n= int(input("insira o numero: "))
maior= n
menor= n
while n>=0:
    if n> maior:
        maior = n
    if n< menor:
        menor = n
    qtd+=1
    n= int(input("insira o numero: "))
print(maior)
print(menor)
print(qtd)
