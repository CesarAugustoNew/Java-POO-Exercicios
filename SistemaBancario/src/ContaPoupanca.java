public class ContaPoupanca extends Conta {

    private static final double RENDIMENTO = 0.05; // 0,5%

    public ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public double calcularRendimento() {
        return getSaldo() * RENDIMENTO;
    }
}