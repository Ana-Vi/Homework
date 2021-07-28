def contar(texto, cont):
    lista= texto.split(" ")
    palavra= lista[0]
    for j in palavra:
        if j== lista[1]:
            cont= cont+1
    return cont

texto= str(input("insira a palavra e o caractere: "))
cont= 0

print(contar(texto, cont))
           
