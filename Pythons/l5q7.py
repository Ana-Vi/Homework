"""Dado um número N, informado pelo usuário, escreva um programa
que leia os N números (assuma que são inteiros e positivos)
e calcule o produtório (multiplicação de números) dos números pares."""
n= int(input("n: "))
f=1
for r in range (1, n+1):
    if r%2==0:
        f=f*r
print(f)
