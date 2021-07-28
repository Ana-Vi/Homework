pA= 80000
tA= 0.03
pB= 200000
tB= 0.015
anos= 0
while(pA<pB):
    anos= anos+1
    pA= pA+(pA*tA)
    pB= pB+(pB*tB)

print("Depois de %i anos A passou B"%anos)


