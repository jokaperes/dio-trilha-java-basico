import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da sua agencia ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +" e seu Saldo " + saldo +" já está disponível para saque.");




    }
}
