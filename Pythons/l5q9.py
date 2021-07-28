lista=[]
n= int(input("quantos algarismos você vai colocar? "))
for aux in range(n):
    num= float(input("número: "))
    lista.append(num)
    
    for ii in lista:
        if [0]<[ii]:
            print("sim")
        else:
            print("não")
        
