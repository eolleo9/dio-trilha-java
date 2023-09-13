import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio02 {
public static void main(String[] args) {
 
  Scanner scanner = new Scanner(System.in);
  
  
  ArrayList<String> ativos = new ArrayList<>();

 
  int quantidadeAtivos = scanner.nextInt(); 
  scanner.nextLine(); 
  

  for (int i = 0; i < quantidadeAtivos; i++) {
    String codigoAtivo = scanner.nextLine(); // 
    ativos.add(codigoAtivo); 
 }

  
  Collections.sort(ativos);

  
  for (String ativoOrdenado : ativos) {
    System.out.println(ativoOrdenado); 
 }
  
  
  scanner.close();
 }
}
