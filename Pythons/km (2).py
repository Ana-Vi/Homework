dias= int(input())
kmtotal=float(input())

kmexcedente= kmtotal- (dias*60)
juros=0

if kmexcedente>0:
    juros= (kmexcedente)*0.50
    preco= (45*dias)+juros
else:
    preco= 45*dias

print("%.2f" %preco)


