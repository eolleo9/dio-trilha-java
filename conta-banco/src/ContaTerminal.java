import java.util.Scanner;
public class ContaTerminal {
   
    public static void main(String[] args) {

        System.out.println("Seja bem-vindo à seção de criação de novas contas!");

        System.out.println("Por favor, digite o seu NOME: ");
        Scanner nomeCliente = new Scanner(System.in);
        
        String nome = nomeCliente.nextLine();

        System.out.println("Por favor, digite a agência: ");
        Scanner agenciaCliente = new Scanner(System.in);

        String agencia = agenciaCliente.nextLine();

        System.out.println("Por favor, digite a conta: ");
        Scanner contaCliente = new Scanner(System.in);

        String conta = contaCliente.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        Scanner saldoCliente = new Scanner(System.in);

        double saldo = saldoCliente.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é de numeração: " + agencia + ".");
        System.out.println("Sua conta é de numeração: " + conta + ".");
        System.out.println("Seu saldo é de R$ " + saldo + ".");



        


        
       


    
        

     










        
        
    }
}
