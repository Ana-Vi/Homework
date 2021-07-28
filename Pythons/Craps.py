import random
n= random.randint(2, 12)
sorte= n
    
if n== 7 or n ==11:
    print("ganhou! Na 1 rodada", n)
    
elif n == 3 or n== 2 or n== 12:
    print("perdeu :( Na 1 rodada", n)
    
else:
    while True:
        n= random.randint(2, 12)
        if n== sorte:
            print("ganhou! Na 2 rodada", n, sorte)
            break
        if n == 12 or n== 2 or n== 3:
            print("perdeu :( Na 2 rodada", n, sorte)
            break
