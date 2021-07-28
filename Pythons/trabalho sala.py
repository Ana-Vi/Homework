def maior(x, y):
    if x>y:
        return x
    else:
        return y

def menor(x, y):
    if x>y:
        return y
    else:
        return x

def listamaior(lista):
    if len(lista)==0:
        return none
    else:
        n= lista[0]
        for aux in lista:
            if aux>n:
                n= aux
        return n

def listamenor(lista):
    if len(lista)==0:
        return none
    else:
        n= lista[0]
        for aux in lista:
            if aux<n:
                n= aux
        return n

def listanum(lista, i):
    cont= 0
    for aux in lista:
        if aux>i:
            cont= cont+1
    return cont

def lista12(lista1, lista2):
    n1= lista1[0]
    n2= lista2[0]
    for aux in lista1:
        if aux> n1:
            n1= aux
    for ind in lista2:
        if ind> n2:
            n2= ind
    if n1> n2:
        return lista1
    else:
        return lista2

def listacomp(lista1, lista2):
    n1= lista1[0]
    n2= lista2[0]
    cont= 0
    for aux in lista1:
        if aux> n1:
            n1= aux
    for ind in lista2:
        if ind> n2:
            n2= ind

    if n1> n2:
        cont= cont+3
    elif n1==n2:
        cont= cont+1
    return cont

def impoupar(x):
    if (x%2)==0:
        x= True
    else:
        x= False
    return x

def listaparouimpar(lista):
    listapar= []
    listaimpar= []
    for aux in lista:
        if aux%2==0:
            listapar.append(aux)
        else:
            listaimpar.append(aux)
    return listapar.sort()
    return listaimpar.sort()

    
