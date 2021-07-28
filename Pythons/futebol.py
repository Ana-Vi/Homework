'''vitoria= 3
empate= 1
derrota= 0
pontos= 0
total=int(input("digite o numero total de jogos: "))
for aux in range(total):
    gol_a_favor= int(input("a favor: "))
    gol_contra= int(input("contra: "))
    if  gol_a_favor>gol_contra:
        pontos= pontos+3
    elif gol_a_favor== gol_contra:
        pontos= pontos+1
    else:
        pontos= pontos
print("Seu tive fez", pontos,"no campeonato")'''
#######################
soma=0
n= int(input())
for x in range(n):
    gols= (input())
    if int(gols[0])>int(gols[2]):
        soma= soma+3
    elif int(gols[0]== gols[2]):
        soma= soma+1
print(soma)
