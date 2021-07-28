n= int(input("alunos: "))
x=n
notag= 0
while n>0:
    nota= float(input("nota: "))
    n= n-1
    if nota>11 or nota<0:
        print("nota inválida")
    notag= notag + nota
    media= notag/x
print(media)
    
            
