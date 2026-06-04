let nome = [];

for (let i = 0; i < 10; i++) {
	nome.push(prompt("digite o " + (i + 1) + "º nome"));
}

for (let i = 0; i < 9; i++) {
	for (let j = i + 1; j < 10; j++) {
		if (nome[i] > nome[j]) {
			let vazio = nome[i]
			nome[i] = nome[j]
			nome[j] = vazio
		}
	}	
}

let resposta = parseFloat(prompt("Deseja continuar? (1 para sim, 0 para não)"));

while (resposta === 1) {

	let pesquisa = parseFloat(prompt("Digite o nome que deseja pesquisar: "));
	let acha = false;
	let comeco = 1;
	let fim = 10;

	while (comeco <= fim && acha === false) {

		let meio = Math.floor((comeco + fim) / 2);
		if (pesquisa === nome[meio]) {
			acha = true; 
		} else {
			if (pesquisa < nome[meio]) {
				comeco = meio + 1;				
			} else {
				comeco = meio - 1;
			}
		}
	}

	if (acha === true) {
		console.log("O nome " + pesquisa + " foi encontrado!"); 
	} else {
		console.log("O nome " + pesquisa + " não foi encontrado na posição " + meio );
	}

	resposta = parseFloat(prompt("Deseja continuar? (1 para sim, 0 para não)"));

}