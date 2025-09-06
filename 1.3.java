import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Equação do Segundo Grau ===");
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau (a não pode ser zero).");
        } else {
            double delta = (b * b) - (4 * a * c);

            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais:");
                System.out.println("x1 = " + raiz1);
                System.out.println("x2 = " + raiz2);
            }
        }

        sc.close();
    }
}
