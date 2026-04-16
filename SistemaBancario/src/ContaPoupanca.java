public class ContaPoupanca extends Conta{

    @Override
    public void sacar(double valor){
        if (valor <=0){
            System.out.println("Erro! Valor inválido.");
        } else if(getSaldo() < valor){
            System.out.println("Erro! Saldo insuficiente.");
        } else {
            debitar(valor);
        }
    }
    @Override
    public void calcularRendimento(){
        double rendimento = getSaldo() * 0.005;
        depositar(rendimento);
    }

}
