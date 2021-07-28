kwh=int(input())
pago=float(0)
if (kwh<30):
    pago= kwh*0.09556
elif(kwh<100 and kwh>31):
    pago=30*0.09556
    pago=pago+((kwh-30)*0.16698)
elif(kwh<200 and kwh>101):
    pago=30*0.09556
    pago=pago+ 70*0.16698
    pago=pago+((kwh-100)*0.25052)
else:
    pago=30*0.09556
    pago=pago+ 70*0.16698
    pago=pago+ 100*0.25052
    pago=pago+((kwh-200)*0.27836)
print (pago)
