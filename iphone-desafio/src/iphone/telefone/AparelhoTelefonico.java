package iphone.telefone;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import iphone.musica.Musicas;

public class AparelhoTelefonico {

    private List<Aparelho> aparelhoList;

    public AparelhoTelefonico(){
        this.aparelhoList = new ArrayList<>();

    }
    public void adicionarTelefone(String nomeContato, int codigoContato){
        aparelhoList.add(new Aparelho(nomeContato, codigoContato));

    }
    public void removerTelefone(String nomeContato){
        List<Aparelho> telefonesRemover = new ArrayList<>();

        for (Aparelho a : aparelhoList){
            if (a.getNomeContato().equalsIgnoreCase(nomeContato)){
                telefonesRemover.add(a);
            }
        }
        aparelhoList.removeAll(telefonesRemover);
    }

      public Set<Aparelho> selecionarContato(String nomeContato) {
            Set<Aparelho> aparelhoNome = new HashSet<>();
            if (!aparelhoList.isEmpty()) {
              for (Aparelho a : aparelhoList) {
                if (a.getNomeContato().startsWith(nomeContato)) {
                  aparelhoNome.add(a);
                }
              }
              return aparelhoNome;
            } else {
              throw new RuntimeException("A lista de contatos está vazia!");
            }
          }

       public Set<Aparelho> ligar(String nomeContato) {
            Set<Aparelho> aparelhoNome = new HashSet<>();
            if (!aparelhoList.isEmpty()) {
                System.out.println("Ligando para contato: ");
                System.out.println(selecionarContato(nomeContato));
              for (Aparelho a : aparelhoList) {
                if (a.getNomeContato().startsWith(nomeContato)) {
                  aparelhoNome.add(a);
                }
              }
              return aparelhoNome;
            } else {
              throw new RuntimeException("A lista de contatos está vazia!");
            }
          }

          public Set<Aparelho> atender(String nomeContato) {
            Set<Aparelho> aparelhoNome = new HashSet<>();
            if (!aparelhoList.isEmpty()) {
                System.out.println("Atendendo ligação de contato: ");
                System.out.println(selecionarContato(nomeContato));
              for (Aparelho a : aparelhoList) {
                if (a.getNomeContato().startsWith(nomeContato)) {
                  aparelhoNome.add(a);
                }
              }
              return aparelhoNome;
            } else {
              throw new RuntimeException("A lista de contatos está vazia!");
            }
          }

          public Set<Aparelho> iniciarCorreioVoz(String nomeContato) {
            Set<Aparelho> aparelhoNome = new HashSet<>();
            if (!aparelhoList.isEmpty()) {
                System.out.println("Iniciando ligação correio voz para contato contato: ");
                System.out.println(selecionarContato(nomeContato));
              for (Aparelho a : aparelhoList) {
                if (a.getNomeContato().startsWith(nomeContato)) {
                  aparelhoNome.add(a);
                }
              }
              return aparelhoNome;
            } else {
              throw new RuntimeException("A lista de contatos está vazia!");
            }
          }



    public void exibirContatos(){
        if (!aparelhoList.isEmpty()){
            System.out.println(aparelhoList);
        } else {
            System.out.println("A lista de contatos está vazia!");
        }

    }
    public static void main(String[] args) {

    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    aparelhoTelefonico.adicionarTelefone("NOME 1", 767652);
    aparelhoTelefonico.exibirContatos();

    aparelhoTelefonico.atender("NOME 1");
        
    }

    
    }

  
    

