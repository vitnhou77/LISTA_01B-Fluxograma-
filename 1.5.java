public class CalculoDesconto {
    public static void main(String[] args) {
        double precoProduto1 = 100.00;
        double precoProduto2 = 120.00;
        double precoProduto3 = 99.00;

        double valorTotalSemDesconto = precoProduto1 + precoProduto2 + precoProduto3;
        double valorDoDesconto = valorTotalSemDesconto * 0.20;
        double valorAPagar = valorTotalSemDesconto - valorDoDesconto;

        System.out.println("--- Resumo da Compra ---");
        System.out.printf("Preço do Produto 1: R$ %.2f%n", precoProduto1);
        System.out.printf("Preço do Produto 2: R$ %.2f%n", precoProduto2);
        System.out.printf("Preço do Produto 3: R$ %.2f%n", precoProduto3);
        System.out.println("------------------------");
        System.out.printf("Valor total da compra (sem desconto): R$ %.2f%n", valorTotalSemDesconto);
        System.out.printf("Valor do desconto (20%%): R$ %.2f%n", valorDoDesconto);
        System.out.printf("Valor final a ser pago: R$ %.2f%n", valorAPagar);
    }
}
