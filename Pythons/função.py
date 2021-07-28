def conta(c, texto):
    cont=0
    for aux in texto:
        if c==aux:
            cont+=1
    return(cont)


c= input()
texto= input()
print(conta(c, texto))
