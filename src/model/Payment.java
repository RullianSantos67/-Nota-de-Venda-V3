package model;

import java.util.Scanner;

public class Payment {

    final double JUROS_CARTAO_CREDITO = 0.05;
    final double DESCONTO_PIX = 0.05;

    // Tornando o método estático para poder chamá-lo de main
   public static void calculatePayment(double total, String paymentMethod) {

        double valorFinal = total;

        switch (paymentMethod) {
            case "CARTAO_CREDITO":
                valorFinal = total * 1.05; // Aplica 5% de juros
                break;
            case "DINHEIRO_PIX":
                valorFinal = total * 0.95; // Aplica 5% de desconto
                break;
            case "CARTAO_DEBITO":
                // Sem alteração no valor
                break;
            default:
                System.out.println("Método de pagamento inválido.");
                return;
        }

        System.out.println("Forma de pagamento: " + paymentMethod);
        System.out.println(String.format("Valor original: %.2f", total));
        System.out.println(String.format("Valor a ser pago: %.2f", valorFinal));
    }
}