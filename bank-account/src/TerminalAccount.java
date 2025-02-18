import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String clientName = scanner.nextLine();

        System.out.print("Qual a sua agencia: ");
        String agency = scanner.nextLine();

        System.out.print("Agora digite o número de sua conta: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Por fim, informe o seu saldo: ");
        double balance = scanner.nextDouble();

        System.out.println(message(clientName, agency, accountNumber, balance));

    }

    public static String message(String name, String agency, int accountNumber, double balance){
        return "Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo de R$" + balance + " já está disponível para saque.";
    }
}