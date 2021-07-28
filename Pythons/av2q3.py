x=10
l=[]
maior=0
menor=10
while x>=0 and x<=10:
    x= float(input())
    l.append(x)
if x>10:
    l.remove(x)
print(min(l), max(l))
        
