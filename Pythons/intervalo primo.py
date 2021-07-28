lista= []
x= int(input())
y= int(input())
z=x
while z< y:
    divisores= 0
    for divisor in range(1, z):
        if z%divisor==0:
            divisores = divisores + 1
            if divisores > 1:
                
                break
    if divisores>1:
        z=z+1
    else:
        z= z+1
        lista.append(z)
    

print(lista)
