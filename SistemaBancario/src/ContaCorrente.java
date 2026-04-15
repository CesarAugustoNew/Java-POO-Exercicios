public class ContaCorrente extends Conta {

    private static final double TAXA = 2.0;

    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + TAXA;

        if (valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public double calcularRendimento() {
        return 0; // naao rende
    }
}