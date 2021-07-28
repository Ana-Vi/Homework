def funcao (lista, n):
    if n in lista:
        return True
    return False
lista=[0, 10, 30, 50, 40, 100]
n= int(input())
print(funcao(lista, n))
