nome = []

for i in range(10):
    nome.append(input("digite o " + str(i + 1) + "º nome"))

for i in range(9):
    for j in range(i + 1, 10):
        if nome[i] > nome[j]:
            vazio = nome[i]
            nome[i] = nome[j]
            nome[j] = vazio

resposta = float(input("Deseja continuar? (1 para sim, 0 para não)"))

while resposta == 1:
    pesquisa = input("Digite o nome que deseja pesquisar: ")
    acha = False
    comeco = 1
    fim = 10

    while comeco <= fim and acha is False:
        meio = (comeco + fim) // 2
        indice = meio - 1
        if 0 <= indice < len(nome) and pesquisa == nome[indice]:
            acha = True
        else:
            if 0 <= indice < len(nome) and pesquisa < nome[indice]:
                comeco = meio + 1
            else:
                comeco = meio - 1

    if acha is True:
        print("O nome " + pesquisa + " foi encontrado!")
    else:
        print("O nome " + pesquisa + " não foi encontrado na posição " + str(meio))

    resposta = float(input("Deseja continuar? (1 para sim, 0 para não)"))