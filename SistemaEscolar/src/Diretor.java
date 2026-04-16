import com.sun.security.jgss.GSSUtil;

public class Diretor extends Pessoa{
    private String tempoDeGestao;

    public Diretor(String nome, int idade, String tempoDeGestao){
        super(nome, idade);
        this.tempoDeGestao = tempoDeGestao;
    }

    @Override
    public void apresentar(){
        System.out.printf("Sou o diretor %s e estou à %d anos na gestão", getNome(), tempoDeGestao);
    }

}
