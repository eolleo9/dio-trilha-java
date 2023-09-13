import java.text.DecimalFormat;
import java.util.Scanner;
public class Desafio04 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++){
            valorFinal += valorFinal * taxaJuros; 
        }

        
        


        System.out.format("Valor final do investimento: R$ " + "%.2f", (valorFinal));
        
        scanner.close();
        
    }
    
}
