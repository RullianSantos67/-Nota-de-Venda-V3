import model.Product;
import model.Sale;
import model.SaleItem;
import model.Payment;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();
        sale.createSaleItem("at", 2);
        sale.createSaleItem("bp", 1);
        sale.createSaleItem("msa", 3);

        for (Object item : sale.getItens()) {
            System.out.println(item);
        }
        System.out.println(String.format("Total: %.2f", sale.getTotal()));


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Cartão de Débito");
        System.out.println("3 - Dinheiro/Pix");

        int escolha = scanner.nextInt();
        String paymentMethod = "";

        switch (escolha) {
            case 1:
                paymentMethod = "CARTAO_CREDITO";
                break;
            case 2:
                paymentMethod = "CARTAO_DEBITO";
                break;
            case 3:
                paymentMethod = "DINHEIRO_PIX";
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double total = sale.getTotal();

        Payment.calculatePayment(total, paymentMethod);
    }

}