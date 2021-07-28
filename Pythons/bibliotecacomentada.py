def cadastrar (qtd, nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco):
    #cadastro de um novo livro
    for aux in range(qtd):
        #especificações do livro
        nome= input("Insira o título do livro: ")
        nomes.append(nome)
        cdg= input("Insira o código do livro: ")
        codigo.append(cdg)
        gnr= input("Insira o gênero do livro: ")
        genero.append(gnr)
        atr= input("Insira o autor do livro: ")
        autor.append(atr)
        pags= input("Insira o número de páginas: ")
        npaginas.append(pags)
        tipo= input("Insira o tipo do livro: ")
        tipolivro.append(tipo)
        valor= input("Insira o preço do livro: ")
        preco.append(valor)
        end= input("Insira o endereço do livro: ")
        endereco.append(end)
    return nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco

def ache (nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco):
    #pesquisar o nome do livro por alguma especificação
    #especificações requeridas
    nminpags= input("Qual o numero mínimo de páginas? ")
    novoouusado= input("O livro é novo ou usado? ")
    maxpreco= input("Qual o preço máximo? ")
    cidade= input("Qual cidade? ")

    #indices dos que passaram pelas condições
    lIndicesValidos = []
    #nomes dos livros que passaram pelas condições
    lNomesValidos = []

    #filtro para buscar os indices que satisfazem as condições
    for indice in range(len(nomes)):
        
        #filtro do usado ou não
        livroNovoOuUsado = tipolivro[indice]
        if(novoouusado != "qualquer" and novoouusado != livroNovoOuUsado):
            continue
        
        #filtro da cidade
        livroCidade= endereco[indice]
        if(cidade != "qualquer" and cidade != livroCidade):
            continue
        
        #filtro preço máximo
        livroPreco= preco[indice]
        if (maxpreco != "qualquer" and float(maxpreco) < float(livroPreco)):
            continue

        #filtro número máximo de páginas
        livroPagina= nminpags[indice]
        if (nminpags != "qualquer" and int(nminpags)< int(livroPagina)):
            continue
        #adicionar os indices que passaram pelo filtro numa lista
        lIndicesValidos.append(indice)
        
    #associar indice com nome
    for i in lIndicesValidos:
        inserir = nomes[i]
        lNomesValidos.append(inserir)
    return lNomesValidos
                             


def excluir (nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco):
    #excluir através do código escrito pelo usuário (cdgex) o livro requerido
    cdgex= input("Insira o código do livro que você deseja excluir: ")
    for i in codigo:
        if i==cdgex:
            valor= codigo.index(i)
            codigo.pop(valor)
            nomes.pop(valor)
            genero.pop(valor)
            autor.pop(valor)
            npaginas.pop(valor)
            tipolivro.pop(valor)
            preco.pop(valor)
            endereco.pop(valor)
            break
        else:
            break
    return nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco


def troca(nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco):
    #troca através do código inserido pelo usuário (cdtr) o livro requerido
    cdtr= input("Insira o código do livro que você deseja alterar: ")
    for change in codigo:
        if change== cdtr:
            indice= codigo.index(change)
            nomes[indice]= input("Alteração de nome: ")
            codigo[indice]= input("Alteração de código: ")
            genero[indice]= input("Alteração de gênero: ")
            autor[indice]= input("Alteração de autor: ")
            npaginas[indice]= input("Alteração do número de páginas: ")
            tipolivro[indice]= input("Alteração do tipo do livro: ")
            preco[indice]= input("Alteração no preco: ")
            endereco[indice]= input("Alteração no endereço: ")
    return nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco
            

#listas vazias para iniciar o programa    
nomes=[]
codigo= []
genero= []
autor= []
npaginas=[]
tipolivro= []
preco=[]
endereco=[]

#executar repetição do programa até que seja exigido o fechamento do mesmo no comando fechar (break)
x=True
while True:
    #ordem é o que será feito no programa
    ordem= str(input("Bom dia, o que deseja fazer? \nTemos as opções: \n novo \n listar todos os livros \n pesquisar \n alterar \n excluir \n fechar \n " ))
    if ordem=="novo":
        #cadastro de um novo livro
        qtd= int(input("Quantos novos livros adicionar? "))
        #puxar da função
        print(cadastrar(qtd,nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco))
    if ordem=="fechar":
        #fechar o programa
        print("Até breve!")
        break
    if ordem=="listar todos os livros":
        #aparecer na tela todos os livros inseridos no programa
        print(nomes)
    if ordem=="excluir":
        #excluir algum livro através do código
        print(excluir(nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco))
    if ordem=="alterar":
        #alterar algum livro através do código
        print(troca(nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco))
    if ordem=="pesquisar":
        #pesquisar, com as exigencias do usuário, um livro que satisfaça as condiçoes
        print(ache (nomes, codigo, genero, autor, npaginas, tipolivro, preco, endereco))
