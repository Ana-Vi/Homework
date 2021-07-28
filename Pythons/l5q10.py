'''Escreva um programa que leia n números inteiros, onde n
é dado pelo usuário, e imprima todos os números lidos na ordem inversa.'''
lista=[]
n=int(input())
for aux in range (n):
    lista.append(int(input()))
    
    print lista[::-1]
        
        
