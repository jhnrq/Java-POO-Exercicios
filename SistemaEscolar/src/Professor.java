public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome,idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar(){
        System.out.printf("Sou o professor %s e leciono %s", getNome(), disciplina);
    }
}
