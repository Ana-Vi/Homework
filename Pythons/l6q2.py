letra= int(input(" 1. insira uma nova nota,"
                 "2. excluir uma nova nota,"
                 "3. mostrar a média aritmética das notas,"
                 "4. mostrar todas as notas sem repetições, mostrando qntas vezes ela se repete, qual a sua letra? "))
lista= []
soma=0
while True:
    
    if letra == 1:
        numero= float(input("qual a nota? "))
        soma+= numero
        lista.append(numero)
        break
    continue

    if letra == 2:
        n= float(input())
        for aux in lista:
            if aux == n:
                lista.remove(n)
        break
            
    continue

    if letra == 3:
        soma/len(lista)
        break
    continue

    if letra == 4:
        for aux in lista:
            if aux == l[0]:
                lista.remove(aux)
                
        print(lista)
