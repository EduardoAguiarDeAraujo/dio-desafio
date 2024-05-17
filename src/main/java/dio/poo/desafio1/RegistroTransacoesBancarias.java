package dio.poo.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        // TODO: Crie a lista para armazenar as transações:
        List<String> transacoes = new ArrayList<>();
        // TODO: Implemente um loop 'for' para iterar sobre as transações:

        for (int i = 1; i <= quantidadeTransacoes; i++ ) {
            String tipoTransacao = scanner.next();
            // Aqui é verificar o tipo de transação e atualiza o saldo da conta de acordo:
            if (tipoTransacao.equalsIgnoreCase("d")) {
                Double valorTransacao = scanner.nextDouble();
                saldo += valorTransacao;
                // TODO: Adicione a transação à lista:
                transacoes.add(i + ". Deposito de " + valorTransacao);
            } else if (tipoTransacao.equalsIgnoreCase("s")) {
                Double valorTransacao = scanner.nextDouble();
                saldo -= valorTransacao;
                // TODO: Adiciona a transação à lista
                transacoes.add(i + ". Saque de " + valorTransacao);
            } else {
                // Se o tipo de transação não for reconhecido, exibe uma mensagem de erro
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }//fim for

    // Aqui é exibido o saldo final e a lista de transações ao final do processo:
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
    // TODO: Crie um loop 'for' para exibir cada transação na lista:
        transacoes.forEach(System.out::println);

    // TODO: Agora exibA o número da transação seguido da descrição da transação:

        // Fechamos o scanner para liberar recursos:
        scanner.close();
    }
}

