import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner sccanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = sccanner.nextLine();

        System.out.println("Por favor, digite número da sua agência em que você gostaria de abrir uma conta: ");
        String agencia = sccanner.nextLine();

        System.out.println("Por favor, digite número da sua conta: ");
        int numeroConta = sccanner.nextInt();
        

        System.out.println("Por favor, digite o saldo da conta: ");
        float saldo = sccanner.nextFloat();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        }
}
