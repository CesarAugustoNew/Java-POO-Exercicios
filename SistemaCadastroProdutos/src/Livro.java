public class Livro extends Produto {

    public Livro(String nome, double preco) {
        super(nome, preco, "Livro");
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.10;
    }
}