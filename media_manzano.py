# Programa para calcular a média final do curso de Algoritimos do professor Agusto Manzano, utilizando as regras de avaliação do curso, exemplo em Python.
print("N1 = trabalhos, presença e entrega de avl. N2 média das avl * 0,8 + média dos trabalhos * 0,2. N3 prova.")

nota_trabalhos = 0
visto = int(input("Você viu todos os vídeos do manzano? (1 para sim, 0 para não) "))

if visto == 1:
    nota_trabalhos = nota_trabalhos + 10
else:
    print("Foi classificada a nota mínima de 6")
    nota_trabalhos = nota_trabalhos + 6

avaliacao = int(input("Quantas avaliações teve até agr? "))
ponto = int(input("Quantas avaliações você entregou? "))

estimativa = 10 / avaliacao
nota_entrega = ponto * estimativa

print("Sua nota de entrega das avaliações é " + "{:.2f}".format(nota_entrega))

presenca = int(input("Você esteve em todas as aulas do manzano? (1 para sim, 0 para não)"))

if presenca == 1:
    nota_trabalhos = nota_trabalhos + 10
else:
    print("Foi classificada a nota mínima de 6")
    nota_trabalhos = nota_trabalhos + 6

print("Essa é a sua média de trabalhos (N1)")
print("N1 = (presença + trabalhos + entrega de avaliações) / 3 ")
N1 = (nota_trabalhos + nota_entrega) / 3
print("{:.2f}".format(N1))

total = int(input("Digite o total de avaliações: "))
media = 0

for i in range(total):
    nota = float(input("Digite a " + str(i + 1) + "ª nota: "))
    media = media + nota

media_avaliacao = media / total
print("Sua média nas avaliações é " + "{:.2f}".format(media_avaliacao))
print("N2 será calculada:")
print("N2 = Média das avaliações * 0,8 + trabalhos * 0,2 ")
N2 = (media_avaliacao * 0.8) + (N1 * 0.2)
print("{:.2f}".format(N2))

prova = int(input("Sua estimativa para a prova final (N3): "))

print("Agora será calculada a média geral para verifcar sua situação (passou, ifa, reprovado): ")
print("Média Final = ((N1 = N2)/2) * 0,85 + N1 * 0,15:")

media_final = ((N2 + prova)/2) * 0.85 + (N1 * 0.15)

if media_final >= 6:
    print("Aprovado")
elif 3.5 <= media_final <= 6:
    print("Está de ifa")
else:
    print("Reprovado direto")
print("{:.2f}".format(media_final))
