import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{

        Scanner SC = new Scanner(System.in);

        String nome;
        double deposito;
        double saque;
        int opçao;

        System.out.println("Digite o nome do titular da conta: ");
        nome = SC.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);

        do { 

            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("4 - Sair");
            opçao = SC.nextInt();

            switch (opçao) {
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    deposito = SC.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    saque = SC.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }  
        } while (opçao != 4);

        SC.close();
        
    }
}