public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco, "Eletrônico");
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }
}