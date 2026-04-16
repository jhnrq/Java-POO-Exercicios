 // Regra de saque: cobra uma taxa fixa de R$ 2,00
// Rendimento: não rende nada (0%)**]]

 public class ContaCorrente extends Conta{

    @Override
     public void sacar(double valor){
        double valorComTaxa = valor + 2;

        if (valor <=0) {
            System.out.println("Erro! Valor inválido.");
        } else if (getSaldo() < valorComTaxa){
            System.out.println("Erro! Saldo insuficiente.");
        } else {
            debitar(valorComTaxa);
        }

    }




}
