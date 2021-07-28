n= int(input("Quantos alunos são? "))
lista=[]
for aux in range (n):
    nota= float(input("Qual a nota? "))
    lista.append(nota)
n2= int(input("quantas notas você quer buscar?"))
for ii in range (n2):
    procura= float(input("Qual nota?"))
    for z in lista:
        if z == procura:
            print("Existe")
        else:
            print("No!")
