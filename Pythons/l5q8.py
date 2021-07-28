'''Dizemos que um número é triangular se ele
é produto de três números naturais consecutivos (e.g.: 120 é triangular
pois 120 = 4.5.6). Dado um natural N, determinar se N é triangular'''

n= int(input("insira o numero: "))
cen= n//100
dez= (n- cen*100)//10
uni=(n- cen*100)%10
print(cen, dez, uni)
if cen+1 == dez and dez+1 == uni:
    print("é")
else:
    print("não")
