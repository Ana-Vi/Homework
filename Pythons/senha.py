'''USUÁRIO DIGITAR UMA SENHA COM PELO MENOS 1 LETRA E 1 NUMERO
LIMITE DE 5 A 8 CARACTERES'''
senha= str(input("insira uma senha: "))
letra= ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z']
if len(senha)< 5 or len(senha)>8:
    print("inválido")
else:
    for aux in senha:
        if aux<> 0 or aux<> 1 or aux<> 2 or aux<>3 or aux<>4 or aux<>5 or aux<>6 or aux<>7 or aux<>8 or aux<>9:
            print("inválido")
        else:
            for d in letra:
                if d <> senha:
                    print("inválido")
                else:
                    print("ótima senha")
