public abstract class Conta {

    private int numero;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Erro! Valor inválido;");
        }

    }

    public void sacar(double valor) {

        if (valor > 0 && saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Erro! Saldo insuficiente.");
        }
    }
    public void calcularRendimento(){
        saldo += saldo * 0.005;

    }

    public double getSaldo(){
        return saldo;
    }

    public void debitar(double valor){
        saldo -= valor;

    }


}