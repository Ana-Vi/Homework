'''Escreva um programa que leia n n�meros inteiros, onde n
� dado pelo usu�rio, e imprima todos os n�meros lidos na ordem inversa.'''
lista=[]
n=int(input())
for aux in range (n):
    lista.append(int(input()))
    
    print lista[::-1]
        
        
