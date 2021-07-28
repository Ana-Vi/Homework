pa= int(input("PA: "))
pb= int(input("PB: "))
g1= float(input("G1: "))
g1= g1/100
g2= float(input("G2: "))
g2= g2/100
anos= 0

ca= pa*g1

cb= pb*g2



while pa<pb:
    anos= anos+1
    pa= pa+ ca
    pb= pb+cb

if anos > 100:
    print("mais de um século")
else:
    print(anos)

'''popA= int(input())
popB= int(input())
anos= 0
cresA= float(input())
cresA= cresA/100
cresB= float(input())
cresB= cresB/100
while (popA <= popB):
    anos= anos+ 1
    popA = popA + (popA * cresA)
    popB = popB + (popB * cresB)
print("Após %i anos o país A ultrapassou o país B em número de habitantes." % anos)
print("País A: %.0f" % popA)
print("País B: %.0f" % popB)'''


