package iphone.navegador;

import java.util.HashSet;
import java.util.Set;

public class NavegadorInternet {

    private Set<AbaNavegador> abaNavegador;

    public NavegadorInternet() {
      this.abaNavegador = new HashSet<>();
    }

    public void adicionarNovaAba(String nomeSite, int codigoAba) {
        abaNavegador.add(new AbaNavegador(nomeSite, codigoAba));
      }
      public void removerAba(int codigoAba) {
        AbaNavegador abaRemover = null;
        if (!abaNavegador.isEmpty()) {
          for (AbaNavegador a : abaNavegador) {
            if (a.getCodigoAba() == codigoAba) {
              abaRemover = a;
              break;
            }
          }
          abaNavegador.remove(abaRemover);
        } else {
          throw new RuntimeException("A lista de abas de navegador está vazia!");
        }
      }

      public void exibirPagina () {
        if (!abaNavegador.isEmpty()) {
          System.out.println(abaNavegador);
        } else {
          System.out.println("A lista de abas do navegador está vazia!");
        }
      }

      public void atualizarPagina(){
        if (!abaNavegador.isEmpty()){
            System.out.println("Atualizando páginas:");
            System.out.println(abaNavegador);
        } else {
            System.out.println("A lista de abas do navegador está vazia!");
        }
      }
    
      


   
    
}
