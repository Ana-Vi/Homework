n= int(input("Quantos alunos s�o? "))
lista=[]
for aux in range (n):
    nota= float(input("Qual a nota? "))
    lista.append(nota)
n2= int(input("quantas notas voc� quer buscar?"))
for ii in range (n2):
    procura= float(input("Qual nota?"))
    for z in lista:
        if z == procura:
            print("Existe")
        else:
            print("No!")
