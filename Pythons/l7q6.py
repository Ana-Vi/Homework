def substituir (palavra, elemento, indices):
    cont= 0
    for x in palavra:
        if cont in indices:
            x=x+elemento
        else: x= x+palavra[cont]


texto= input("insira a palavra, o caractere e o indice: ")
lista= texto.split(" ")
palavra= lista[0]
elemento= lista[1]
semiindice= lista[2]
indices= semiindice.split(",")
