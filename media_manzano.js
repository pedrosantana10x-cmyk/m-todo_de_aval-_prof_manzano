// Programa para calcular a média final do curso de Algoritimos do professor Agusto Manzano, utilizando as regras de avaliação do curso, exemplo em JavaScript.
console.log("N1 = trabalhos, presença e entrega de avl. N2 média das avl * 0,8 + média dos trabalhos * 0,2. N3 prova.");

let nota_trabalhos = 0;
let visto = parseInt(prompt("Você viu todos os vídeos do manzano? (1 para sim, 0 para não) "));

if (visto === 1) {
    nota_trabalhos = nota_trabalhos + 10;
} else {
    console.log("Foi classificada a nota mínima de 6");
    nota_trabalhos = nota_trabalhos + 6;
}

let avaliacao = parseInt(prompt("Quantas avaliações teve até agr? "));
let ponto = parseInt(prompt("Quantas avaliações você entregou? "));

let estimativa = 10 / avaliacao;
let nota_entrega = ponto * estimativa;

console.log("Sua nota de entrega das avaliações é " + nota_entrega.toFixed(2));

let presenca = parseInt(prompt("Você esteve em todas as aulas do manzano? (1 para sim, 0 para não)"));

if (presenca === 1) {
    nota_trabalhos = nota_trabalhos + 10;
} else {
    console.log("Foi classificada a nota mínima de 6");
    nota_trabalhos = nota_trabalhos + 6;
}

console.log("Essa é a sua média de trabalhos (N1)");
console.log("N1 = (presença + trabalhos + entrega de avaliações) / 3 ");
let N1 = (nota_trabalhos + nota_entrega) / 3;
console.log(N1.toFixed(2));

let total = parseInt(prompt("Digite o total de avaliações: "));
let media = 0;

for (let i = 0; i < total; i++) {
    let nota = parseFloat(prompt("Digite a " + (i + 1) + "ª nota: "));
    media = media + nota;
}

let media_avaliacao = media / total;
console.log("Sua média nas avaliações é " + media_avaliacao.toFixed(2));
console.log("N2 será calculada:");
console.log("N2 = Média das avaliações * 0,8 + trabalhos * 0,2 ");
let N2 = (media_avaliacao * 0.8) + (N1 * 0.2);
console.log(N2.toFixed(2));

let N3 = parseInt(prompt("Sua estimativa para a prova final (N3): "));

console.log("Agora será calculada a média geral para verificar sua situação (passou, ifa, reprovado): ");
console.log("Média Final = ((N1 + N2)/2) * 0,85 + N1 * 0,15:");

let media_final = ((N2 + N3) / 2) * 0.85 + (N1 * 0.15);

if (media_final >= 6) {
    console.log("Aprovado");
} else if (media_final >= 3.5 && media_final <= 6) {
    console.log("Está de ifa");
} else {
    console.log("Reprovado direto");
}
console.log(media_final.toFixed(2));
