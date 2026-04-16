import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Aluno("João", 21, "12C4"));
        lista.add(new Aluno("Henrique", 22, "23D5"));
        lista.add(new Professor("Angêla", 40, "Matemática"));
        lista.add(new Professor("Daniel", 33, "Geografia"));
        lista.add(new Diretor("Roseli", 60, "20"));

        for (Pessoa p : lista){
            p.apresentar();
        }
    }
}
