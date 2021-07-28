nota1 = float(input("1º nota ="))
nota2 = float(input("1º nota ="))
trab= float(input(“Digite a nota do trabalho”))
media =((nota+nota2)/2)
sorte=1
print("media = ", media)
if media < 3:
    print("po garoto, reprovado")
elif media<6 and media>3:
    print("vou te dar uma chance de melhorar, recuperação amanhã")
else:
    print("aaee garoto, ta aprovadaçooo")
