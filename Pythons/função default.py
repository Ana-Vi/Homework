def contardefault(texto="hello World", ch="e"):
    cont= 0
    cont= contarChar(texto, ch)
    return cont
def contar (texto, ch):
    cont= 0
    for t in texto:
        if ch==t:
            cont+=1
    return cont
texto= input()
ch= input()
