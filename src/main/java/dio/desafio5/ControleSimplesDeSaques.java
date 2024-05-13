package dio.desafio5;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();
        for (double i = limiteDiario; limiteDiario > 0; i++){
            double saque = scanner.nextDouble();
            if (saque == 0.0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            if (limiteDiario > saque) {
                limiteDiario -= saque;
                System.out.println(String.format("Saque realizado. Limite restante: %.1f", limiteDiario));
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();
    }
}

