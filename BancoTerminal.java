import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BancoTerminal {
    public static void main(String[] args) {
        //importando a classe scanner para verificar e criar usuarios
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("       BEM VINDO AO     ");
        System.out.println("       BANCO DA DIO     ");
        System.out.println("------------------------");

        //criando a conta do usuario
        System.out.println("Digite Seu nome: ");
        String cliente = scanner.next();

        //consultando a conta
        System.out.println("Digite o numero da conta");
        String conta = scanner.next();

        //numero da agencia
        System.out.println("Digite o número da agẽncia: ");
        String agencia = scanner.next();

        //digite o valor do saldo
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        //saida de tudo
        System.out.println("Óla " + cliente + ", Obrigado por criar uma conta conosco!");
        System.out.println("Sua conta e agência : " + conta + "-" + agencia);
        System.out.println("Seu saldo é de:" + saldo);

        }
}