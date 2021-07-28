dia= int(input("coloque a quantidade de dias de uso: "))
km= int(input("coloque a quantidade de km rodados: "))

valor= (45 * dia)

if km>60:
    print("o valor é"), (valor) + 0.5 * (km - 60),"."
if km<=60:
    print ("o valor é") , valor , "."
