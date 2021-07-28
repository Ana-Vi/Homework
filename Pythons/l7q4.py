def touf(texto):
  lista= texto.split(" ")
  palavra= lista[0]
  x= False
  for j in palavra:
    if j== lista[1]:
        x=True
  return x
texto= str(input("insira a palavra e o caractere: "))
print(touf(texto))
