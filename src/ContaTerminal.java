import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n_conta;
        String agencia, nome_cliente;
        double saldo;

        System.out.println("Por gentileza, informe o numero da conta: ");
        n_conta = scan.nextInt();
        System.out.println("Por gentileza, informe a agencia: ");
        agencia = scan.next();
        System.out.println("Por gentileza, informe o nome do cliente: ");
        nome_cliente = scan.next();
        System.out.println("Por gentileza, informe o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("\nOlá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + n_conta + " e seu saldo e R$" + saldo + " ja esta disponivel para saque");
    }
}