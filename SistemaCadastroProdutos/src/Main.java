import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Livro("Java Básico", 100));
        produtos.add(new Livro("Power BI", 300));
        produtos.add(new Eletronico("Celular", 2000));
        produtos.add(new Alimento("Arroz", 50));

        for (Produto p : produtos) {

            double desconto = p.calcularDesconto();
            double precoFinal = p.getPreco() - desconto;

            System.out.println("Produto: " + p.getNome());
            System.out.println("Preço original: R$ " + p.getPreco());
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Preço com desconto: R$ " + precoFinal);
            System.out.println("---------------------------");
        }
    }
}