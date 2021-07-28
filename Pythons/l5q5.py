"""Utilize a estrutura de listas criada no exercício anterior e busque
pela maior e menor nota dos alunos. Apresente da seguinte
forma (use duas casas decimais):
Maior nota: 9.00
Menor nota: 3.50"""

lista=[]
maiornota=0
menornota=0
n=int(input("insira quantas notas irá colocar: "))
for aux in range (n):
    nota= float(input("insira sua nota: "))
    lista.append(nota)
    for a in lista:
        if a>lista:
            a= maiornota
        if a<lista:
            a= menornota
print(maiornota)
print(menornota)
