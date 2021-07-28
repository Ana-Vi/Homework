'''lista= []
y=0
n= int(input("insira: 1, 2 ou 3: "))
while n ==1 or n==2 or n==3:
    if n ==1:
        j= input("pode pá: ")
        lista.append(j)
        print(lista)
    if n ==2:
        lista.pop
        print(lista)
    if n==3:
        print(len(lista))
else:
    print("EU PEDI 1, 2 OU 3 DISGRAÇA")'''

    ######################################################
lista=[]
while True:
    print("insira: 1, 2 ou 3: ")
    n= int(input())
    if n ==1:
        lista.append(n)
    elif n==2:
        if len(lista)> 0:
            lista.pop()
    elif n== 3:
        print(len(lista))
