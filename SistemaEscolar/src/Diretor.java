public class Diretor extends Pessoa {

    private int tempoGestao;

    public Diretor(String nome, int idade, int tempoGestao) {
        super(nome, idade);
        this.tempoGestao = tempoGestao;
    }

    public int getTempoGestao() {
        return tempoGestao;
    }

    public void setTempoGestao(int tempoGestao) {
        this.tempoGestao = tempoGestao;
    }

    @Override
    public String apresentar() {
        return "Sou o diretor " + getNome() +
                ", há " + tempoGestao + " anos na gestão.";
    }
}