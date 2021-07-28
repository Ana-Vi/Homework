puladores= int(input("quantos puladores são? "))
while puladores>0:
    lista=[]
    nome= int(input("nome: "))
    for aux in range (3):
        lista.append(float(input()))
        nmax= lista[0]
        for j in lista:
            if j>nmax:
                nmax=j
                
    puladores= puladores-1
        
print(lista)
