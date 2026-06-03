import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) { 
        System.out.println("N1 = trabalhos, presença e entrega de avl. N2 média das avl * 0,8 + média dos trabalhos * 0,2. N3 prova.");

        int nota_trabalhos = 0;
        System.out.print("Você viu todos os vídeos do manzano? (1 para sim, 0 para não) ");
        int visto = Integer.parseInt(scanner.nextLine());

        if (visto == 1) {
            nota_trabalhos = nota_trabalhos + 10;
        } else {
            System.out.println("Foi classificada a nota mínima de 6");
            nota_trabalhos = nota_trabalhos + 6;
        }

        System.out.print("Quantas avaliações teve até agr? ");
        int avaliacao = Integer.parseInt(scanner.nextLine());
        System.out.print("Quantas avaliações você entregou? ");
        int ponto = Integer.parseInt(scanner.nextLine());

        double estimativa = 10.0 / avaliacao;
        double nota_entrega = ponto * estimativa;

        System.out.printf("Sua nota de entrega das avaliações é %.2f%n", nota_entrega);

        System.out.print("Você esteve em todas as aulas do manzano? (1 para sim, 0 para não) ");
        int presenca = Integer.parseInt(scanner.nextLine());

        if (presenca == 1) {
            nota_trabalhos = nota_trabalhos + 10;
        } else {
            System.out.println("Foi classificada a nota mínima de 6");
            nota_trabalhos = nota_trabalhos + 6;
        }

        System.out.println("Essa é a sua média de trabalhos (N1)");
        System.out.println("N1 = (presença + trabalhos + entrega de avaliações) / 3 ");
        double N1 = (nota_trabalhos + nota_entrega) / 3;
        System.out.printf("%.2f%n", N1);

        System.out.print("Digite o total de avaliações: ");
        int total = Integer.parseInt(scanner.nextLine());
        double media = 0;

        for (int i = 0; i < total; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            double nota = Double.parseDouble(scanner.nextLine());
            media = media + nota;
        }

        double media_avaliacao = media / total;
        System.out.printf("Sua média nas avaliações é %.2f%n", media_avaliacao);
        System.out.println("N2 será calculada:");
        System.out.println("N2 = Média das avaliações * 0,8 + trabalhos * 0,2 ");
        double N2 = (media_avaliacao * 0.8) + (N1 * 0.2);
        System.out.printf("%.2f%n", N2);

        System.out.print("Sua classificação para a prova final (N3): ");
        int N3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Agora será calculada a média geral para verificar sua situação (passou, ifa, reprovado): ");
        System.out.println("Média Final = ((N1 + N2)/2) * 0,85 + N1 * 0,15:"); original da sua string de console, mas aplicando as variáveis corretas da fórmula matemática que estava no JS.
        double media_final = ((N2 + N3) / 2) * 0.85 + (N1 * 0.15);

        if (media_final >= 6) {
            System.out.println("Aprovado");
        } else if (media_final >= 3.5 && media_final <= 6) {
            System.out.println("Está de ifa");
        } else {
            System.out.println("Reprovado direto");
        }
        System.out.printf("%.2f%n", media_final);
        scanner.close();
    }
}
