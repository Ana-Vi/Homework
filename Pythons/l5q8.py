'''Dizemos que um n�mero � triangular se ele
� produto de tr�s n�meros naturais consecutivos (e.g.: 120 � triangular
pois 120 = 4.5.6). Dado um natural N, determinar se N � triangular'''

n= int(input("insira o numero: "))
cen= n//100
dez= (n- cen*100)//10
uni=(n- cen*100)%10
print(cen, dez, uni)
if cen+1 == dez and dez+1 == uni:
    print("�")
else:
    print("n�o")
