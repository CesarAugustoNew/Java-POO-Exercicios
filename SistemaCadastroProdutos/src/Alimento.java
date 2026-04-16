public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco, "Alimento");
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.02;
    }
}