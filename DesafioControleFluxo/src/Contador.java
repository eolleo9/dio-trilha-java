
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = teclado.nextInt();
        try {
            contar(n1, n2);
            
           

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            
        }

      
            }
        

       static void contar (int n1, int n2) throws ParametrosInvalidosException {
            if (n1 < n2)
            System.out.println("Os números foram validados e iniciaremos a contagem em instantes!");

            else
            System.out.println("Os números são inválidos pois o primeiro é maior que o segundo!");

            int contagem = n2 - n1; 
            for (int i = n1; i < n2; i++) {
                System.out.println(contagem);
                contagem--;
    }
}

}
    

