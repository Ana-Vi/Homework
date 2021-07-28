try:
#precisaremos, inicialmente de dois textos e uma variável vazia que conterá a
#frase mista
#passo 1
    texto1=input()
    texto2=input()
    frasenova= ''
#caso os textos não possuam o número de letras igual teremos que armazená-las
#em variáveis, para no final adicioná-las, já que o programa para quando os
#caracteres do menor texto acabar
#passo 5
    letraextra= ''
    letraextra2= ''
#temos que transformar um texto, com espaços em uma palavra só, como usamos no
#programa do palíndromo, primeiro split e depois join nos dois textos
#passo 2
    texto1= texto1.split()
    texto2=texto2.split()
    texto1= ''.join(texto1)
    texto2= ''.join(texto2)
    
#não dará erro, mas o programa sairá incorreto sem esse passo
#passo 6
#temos que fazer a mesma coisa que fizemos no passo 4, porém esse é caso o
#texto2 for maior que o primeiro
    if len(texto2)>len(texto1):
        texto3= texto2[::-1]
        for i in range((len(texto2))-(len(texto1))):
            letraextra=letraextra+texto3[i]
        letraextra= letraextra[::-1]
#essa é a espinha dorsal, do programa, com ela vamos varrer cada caracter do
#texto1 e ir adicionando na variável frasenova, junto com o elemento do
#mesmo indice do texto2
#passo 3
#aqui encontramos um erro, só adicionará enquanto os dois tiverem o número
#de caracteres igual, caso contrário Erro ou meia palavra
    else:
        
        for letra in texto1:
            indice2=texto1.index(letra)
            frasenova= frasenova+letra+texto2[indice2]
        print(frasenova+letraextra)
    
#para parar com o Erro que aparece temos que fazer essa condição
#o erro acontece pq o texto1 é maior doq o texto2 então não tem como adicionar
#um indice do texto2 que não existe, já que é menor doq o texto1
#passo 4
except (IndexError):
    if len(texto1)>len(texto2):
#temos que inverter o texto1, para as letras que sobraram ficarem na frente
        texto1=texto1[::-1]
#esse é um for que repete o número de vezes que sobra um elemento do texto1
#conseguimos fazer isso subtraindo a quantidade de elementos do texto1 com
#o texto2
        for aux in range((len(texto1))-(len(texto2))):
#armazenamos no letraextra2, vamos armazenando até o laço acabar
            letraextra2= letraextra2+texto1[aux]
#depois temos que desinverter, já que o que sobrou vou colocado de trás para
#frente
        letraextra2= letraextra2[::-1]
#e só então adicioná-lo no que será entregue ao usuário       
        frasenova= frasenova+letraextra2
        print(frasenova)
   
    
