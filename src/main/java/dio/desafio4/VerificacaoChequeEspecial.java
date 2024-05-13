package dio.desafio4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saldo - saque > 0) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saldo + limiteChequeEspecial - saque > 0) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao não realizada. Limite do cheque especial excedido.");
        }
        scanner.close();
    }//Fim main
}

