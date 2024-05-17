package dio.basico.desafio1;

import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        Boolean loop = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        System.out.println("1.Depositar");
        System.out.println("2.Sacar");
        System.out.println("3.Consultar Saldo");
        System.out.println("0.Encerrar");
        while (loop) {
            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
//                    System.out.println("Informe o valor para depositar.");
                    saldo += scanner.nextDouble();
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;
                case 2:
//                    System.out.println("Informe o valor para sacar");
                    Double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println(String.format("Saldo atual: %.1f", saldo));
                    }
                    break;
                case 3:
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }//fim main
}
