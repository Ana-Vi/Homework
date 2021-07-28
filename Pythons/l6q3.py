produto= float(input("insira o valor: "))
soma= produto
while produto> 0:
    produto= float(input("insira o valor: "))
    soma+= produto
dinheiro= float(input("dinheiro dado pelo cliente: "))
troco= dinheiro - soma
print("Total: ", soma)
print("Dinheiro: ", dinheiro)
print("Troco: ", troco)
