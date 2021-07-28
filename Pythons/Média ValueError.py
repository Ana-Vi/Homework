try:
    n= float(input())
    n2= float(input())
    media= (n+n2)/2
    if media <= 0 and media <4:
        print("Seu conceito é: E, média %.2f"%media)
    elif media <=4 and media <6:
        print("Seu conceito é: D, média %.2f"%media)
    elif media <= 6 and media  < 7.5:
        print("Seu conceito é: C, média %.2f"%media)
    elif media <= 7.5 and media <9:
        print("Seu conceito é: B, média %.2f"%media)
    else:
        print("Seu conceito é: A, média %.2f"%media)
    

except (ValueError):
    print("Isso não é um número")
