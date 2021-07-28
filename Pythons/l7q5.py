def listaret(palavra,letra):
  l=[]
  for x in range(len(palavra)):
    if letra==palavra[x]:
      l.append(x)
  return l


texto= str(input("insira a palavra e o caractere: "))
lista= texto.split(" ")
palavra= lista[0]
letra= lista[1]
print(listaret(palavra,letra))
