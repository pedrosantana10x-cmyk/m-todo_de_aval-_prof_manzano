import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner prompt = new Scanner(System.in);

String[] nome = new String[10];

for (int i = 0; i < 10; i++) {
    System.out.print("digite o " + (i + 1) + "º nome: ");
    nome[i] = prompt.nextLine();
}

for (int i = 0; i < 9; i++) {
    for (int j = i + 1; j < 10; j++) {
        if (nome[i].compareTo(nome[j]) > 0) {
            String vazio = nome[i];
            nome[i] = nome[j];
            nome[j] = vazio;
        }
    }
}

System.out.print("Deseja continuar? (1 para sim, 0 para não): ");
int resposta = Integer.parseInt(prompt.nextLine());

while (resposta == 1) {
    System.out.print("Digite o nome que deseja pesquisar: ");
    String pesquisa = prompt.nextLine();
    boolean acha = false;
    int comeco = 0; // índices em Java começam em 0
    int fim = 9;
    int meio = -1;

    while (comeco <= fim && acha == false) {
        meio = (comeco + fim) / 2;
        int cmp = pesquisa.compareTo(nome[meio]);
        if (cmp == 0) {
            acha = true;
        } else {
            if (cmp < 0) {
                fim = meio - 1;
            } else {
                comeco = meio + 1;
        }
    }
}

if (acha == true) {
    System.out.println("O nome " + pesquisa + " foi encontrado!");
} else {
    System.out.println("O nome " + pesquisa + " não foi encontrado na posição " + meio);
}

System.out.print("Deseja continuar? (1 para sim, 0 para não): ");
resposta = Integer.parseInt(prompt.nextLine());
}

prompt.close();
}
}