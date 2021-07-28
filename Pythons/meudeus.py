texto1= input()
texto2= input()
frasenova= ''
letraextra= ''
letraextra2= ''
texto1= texto1.split()
texto2=texto2.split()
texto1= ''.join(texto1)
texto2= ''.join(texto2)

if len(texto2)>len(texto1):
    texto3= texto2[::-1]
    for i in range((len(texto2))-(len(texto1))):
        letraextra=letraextra+texto3[i]
    letraextra= letraextra[::-1]
elif len(texto1)> len(texto2):
    texto3= texto1[::-1]
    for aux in range((len(texto1))-(len(texto2))):
        letraextra= letraextra+texto3[aux]
    letraextra= letraextra[::-1]
else:
    letraextra= letraextra
    
for letra in texto1:
    indice2= texto1.index(letra)
    frasenova= frasenova+letra+texto2[indice2]
print(frasenova+letraextra)
