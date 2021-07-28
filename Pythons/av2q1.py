txt= input()
l=txt.split(" ")
w=[]
for aux in l:
    w.append(len(aux))
print("-".join(map(str,w)))
