package conta.banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);    int numero;

    String agencia, nomeCliente;
    double saldo;

    System.out.println("Por favor, digite o número de Usuário ");
    numero = sc.nextInt();

    System.out.println("Por favor, digite o número da Agência! ");
    agencia = sc.next();

    sc.nextLine();

    System.out.println("Por favor, digite o Nome do Cliente: ");
    nomeCliente = sc.nextLine();

    System.out.println("Por favor, digite o Saldo: ");
    saldo = sc.nextDouble();

    System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
            "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
            " já está disponível para saque.");}
}