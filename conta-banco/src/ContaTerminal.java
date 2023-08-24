import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agencia: ");
        int numeroAgencia= scanner.nextInt();

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.next();

        System.out.print("Digite o saldo do cliente: ");
        Double saldo = scanner.nextDouble();


        //Exibir a mensagem final
        System.out.println("\nOlá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é a "+ numeroAgencia + ", sua conta é " + numeroConta + " e seu saldo "+ saldo + " já está disponível para saque.\n ");
    }
}
