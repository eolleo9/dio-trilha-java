import java.util.Scanner;

public class Desafio01 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o saldo atual: ");

        double saldoAtual = scanner.nextDouble();

        System.out.println("Digite o valor do deposito: ");

        double valorDeposito = scanner.nextDouble();

        System.out.println("Digite o valor do retirada: ");
        double valorRetirada = scanner.nextDouble();

        double saldoFinal = saldoAtual + valorDeposito - valorRetirada;
        System.out.println("O seu saldo após a transação é de " + saldoFinal);



    }
}

