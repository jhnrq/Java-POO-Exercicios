public class Aluno extends Pessoa{

    private String matriucla;

    public Aluno(String nome, int idade, String matriucla){
        super(nome,idade);
        this.matriucla = matriucla;
    }
    @Override
    public void apresentar(){
        System.out.printf("Sou o aluno %s, tenho %d e matrícula %s", getNome(), getIdade(), matriucla);
    }
}
