lista=[]
n= int(input("quantos algarismos voc� vai colocar? "))
for aux in range(n):
    num= float(input("n�mero: "))
    lista.append(num)
    
    for ii in lista:
        if [0]<[ii]:
            print("sim")
        else:
            print("n�o")
        
