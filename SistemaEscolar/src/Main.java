import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("João", 20, 123));
        pessoas.add(new Professor("Maria", 40, "Matemática"));
        pessoas.add(new Diretor("Carlos", 50, 10));

        for (Pessoa p : pessoas) {
            System.out.println(p.apresentar());
        }
    }
}