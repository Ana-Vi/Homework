n= int(input())
for aux in range (2, n+1):
    primo = True
    for i in range (2, aux):
        if aux%i==0:
            primo = False
    if primo:
        print(aux)
