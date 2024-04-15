import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldoConta = 1600;

        System.out.println("**********************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldoConta);
        System.out.println("\n**********************************");

        int opcao;
        String menu = """
                ** Digite a opção**
                1 - Consultar Saldo
                2 - Transferir Valores
                3 - Receber Valores 
                4 - Sair
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);
        do {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nO seu saldo atual é " + saldoConta);
                    break;
                case 2:
                    System.out.println("Qual o valor que deseja transferir? ");
                    double valoraTransferir = leitura.nextDouble();
                    if (valoraTransferir > saldoConta) {
                        System.out.println("Não há saldo suficiente para essa transferência");
                    } else {
                        saldoConta -= valoraTransferir;
                        System.out.println("\nVocê tranferiu R$" + valoraTransferir + " e seu saldo atual é R$" + saldoConta);
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor que você vai receber?");
                    double valorAReceber = leitura.nextDouble();
                    saldoConta += valorAReceber;
                    System.out.println("\nVocê recebeu R$" + valorAReceber + " e o seu saldo atual é R$" + saldoConta);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }
}
