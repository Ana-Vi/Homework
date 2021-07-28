'''n= int(input("1 inclui, 2 exclui, 3 lista"))
lista=[]
if n== 1:
    lista.append()
elif n==2:
    lista.remove()
elif: n==3:
    len(lista)'''


####################################
def incluir(l):
    num= int(input())
    lista.append(num)
def excluir(l):
    if not pilhavazia(l):
        lista.pop()
def listar(l):
    for ele in l:
        print (ele)
def pilhavazia(p):
    if len(p)==0:
        return True
    else:
        return False 

def encontrar(l):
    num= int(input())
    for aux in lista:
        if aux == num:
            return True
        else:
            return False
n=0
lista=[]
while n<>5:
    n= int(input())
    if n==1:
        incluir(pilha)
        
    elif n==2:
        x= input()
        excluir(pilha)
    elif n==3:
        listar(pilha)
    elif n==4:
        break
    elif n==5:
        encontrar(pilha)
