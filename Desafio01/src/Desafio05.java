import java.util.Scanner;
public class Desafio05 {
    public static void main(String[] args) {
         double valor = scanner.nextDouble();

        if (valor > 0) {

            double saldo = valor;

            System.out.format("Deposito realizado com sucesso!" + "Saldo atual: R$ %.2f", saldo);
            
        } else if (valor == 0) {

            System.out.println("Encerrando o programa...");
            
        } else {

            System.out.println("Valor inválido! Digite um valor maior que zero.");
            
        }
        
    }
    
}
