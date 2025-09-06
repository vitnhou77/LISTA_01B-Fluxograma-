import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] afirmacoes = {
            "O milho Verde é verde.",
            "O quadro negro é preto",
            "O Brasil fica na América do Sul."
        };

        char[] gabarito = {'F', 'F', 'V'};
        char[] respostasUsuario = new char[afirmacoes.length];

        int pontos = 0;

        System.out.println("=== Jogo de Verdadeiro ou Falso ===\n");
        for (int i = 0; i < afirmacoes.length; i++) {
            System.out.println("Afirmação " + (i + 1) + ": " + afirmacoes[i]);
            System.out.print("Digite V (verdadeiro) ou F (falso): ");

            char resposta = scanner.next().toUpperCase().charAt(0);
            respostasUsuario[i] = resposta;

            if (resposta == gabarito[i]) {
                pontos++;
            }
            System.out.println();
        }

        System.out.println("=== Gabarito ===");
        for (int i = 0; i < afirmacoes.length; i++) {
            System.out.println((i + 1) + ". " + afirmacoes[i] +
                               " -> Correto: " + gabarito[i] +
                               " | Sua resposta: " + respostasUsuario[i]);
        }

        System.out.println("\nVocê acertou " + pontos + " de " + afirmacoes.length + ".");

        scanner.close();
    }
}
