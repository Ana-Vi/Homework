import string
string.punctuation
x = {}
palavra= input()
txt= "Ana Vitória caiu no chão e chorou, depois comeu um sorvete"
txt= txt.lower()
for c in string.punctuation:
    txt= txt.replace(c, " ")
txt = txt.split()

for p in txt:
    if p not in x:
        x[p] = 1
    else:
        x[p] += 1
print(x[palavra])
