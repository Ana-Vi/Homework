"""Dado um n�mero N, informado pelo usu�rio, escreva um programa
que leia os N n�meros (assuma que s�o inteiros e positivos)
e calcule o produt�rio (multiplica��o de n�meros) dos n�meros pares."""
n= int(input("n: "))
f=1
for r in range (1, n+1):
    if r%2==0:
        f=f*r
print(f)
