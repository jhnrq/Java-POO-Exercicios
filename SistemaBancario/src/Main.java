import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        int opcao;
        int tipoConta;


        do {
            System.out.println("==== Banco ====");
            System.out.println("Escolha a opção desejada:");
            System.out.println("[1] Depositar  |  [2] Sacar  |  [3] Ver saldo  |  [4] Ver rendimento  |  [0] Sair");
            opcao = sc.nextInt();

            if (opcao != 0) {
                System.out.println("Selecione o tipo de conta: ");
                System.out.println("[1] Poupança  |  [2]  Corrente");
                tipoConta = sc.nextInt();

                Conta conta;

                if (tipoConta == 1) {
                    conta = cc;
                } else {
                    conta = cp;
                }

                switch (opcao) {
                    case 1:
                        System.out.print("Valor para depósito: ");
                        double dep = sc.nextDouble();
                        conta.depositar(dep);
                        break;
                    case 2:
                        System.out.print("Valor para sacar: ");
                        double saq = sc.nextDouble();
                        conta.sacar(saq);
                        break;
                    case 3:
                        System.out.println("Saldo: R$" + conta.getSaldo());
                        break;
                    case 4:
                        conta.calcularRendimento();
                        System.out.println("Rendimento aplicado");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
        System.out.println("Sistema encerrado.");
    }
}
