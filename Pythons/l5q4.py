n= int(input("Quantos alunos são? "))
soma= 0
for aux in range (n):
    nota= float(input("Qual a nota? "))
    soma= soma+nota
media= soma/n
print("%.2f" %media)
