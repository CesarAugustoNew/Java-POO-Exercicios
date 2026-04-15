import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA BANCÁRIO ===");

        // Escolher tipo de conta
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        int tipo = sc.nextInt();

        // Dados iniciais
        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        Conta conta;

        if (tipo == 1) {
            conta = new ContaCorrente(numero, saldo);
        } else {
            conta = new ContaPoupanca(numero, saldo);
        }

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Ver rendimento");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depositar: ");
                    double dep = sc.nextDouble();
                    conta.depositar(dep);
                    break;

                case 2:
                    System.out.print("Valor para sacar: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;

                case 4:
                    System.out.println("Rendimento: " + conta.calcularRendimento());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}