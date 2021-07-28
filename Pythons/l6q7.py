mensagem= input("digite sua mensagem: ")
for aux in mensagem:
    if aux =="_":
        aux= "<i/>"
    elif aux == "*":
        aux= "<b/>"
print(mensagem)
