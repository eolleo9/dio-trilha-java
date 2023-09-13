package iphone.musica;

import java.util.HashSet;
import java.util.Set;

    public class ReprodutorMusical {

        private Set<Musicas> musicas;

        public ReprodutorMusical(){
            this.musicas = new HashSet<>();
        }

        public void adicionarMusica(String nomeMusica, int codigoMusica){
            musicas.add(new Musicas(nomeMusica, codigoMusica));
        }
        public void removerMusica(int codigoMusica) {
            Musicas musicaRemover = null;
            if (!musicas.isEmpty()) {
              for (Musicas m : musicas) {
                if (m.getCodigoMusica() == codigoMusica) {
                  musicaRemover = m;
                  break;
                }
              }
              musicas.remove(musicaRemover);
            } else {
              throw new RuntimeException("A lista de músicas está vazia!");
            }
          }

          public Set<Musicas> selecionarMusica(String nomeMusica) {
            Set<Musicas> musicasNome = new HashSet<>();
            if (!musicas.isEmpty()) {
              for (Musicas m : musicas) {
                if (m.getNomeMusica().startsWith(nomeMusica)) {
                  musicasNome.add(m);
                }
              }
              return musicasNome;
            } else {
              throw new RuntimeException("A lista de músicas está vazia!");
            }
          }

             public Set<Musicas> tocar(String nomeMusica) {
            Set<Musicas> musicasNome = new HashSet<>();
            if (!musicas.isEmpty()) {
                System.out.println("Tocando música: ");
                System.out.println(selecionarMusica(nomeMusica));
              for (Musicas m : musicas) {
                if (m.getNomeMusica().startsWith(nomeMusica)) {
                  musicasNome.add(m);
                }
              }
              return musicasNome;
            } else {
              throw new RuntimeException("A lista de músicas está vazia!");
            }
          }

             public Set<Musicas> pausar(String nomeMusica) {
            Set<Musicas> musicasNome = new HashSet<>();
            if (!musicas.isEmpty()) {
                System.out.println("Pausando música: ");
                System.out.println(selecionarMusica(nomeMusica));
              for (Musicas m : musicas) {
                if (m.getNomeMusica().startsWith(nomeMusica)) {
                  musicasNome.add(m);
                }
              }
              return musicasNome;
            } else {
              throw new RuntimeException("A lista de músicas está vazia!");
            }
          }

          public void exibirLista(){
            if (!musicas.isEmpty()){
              System.out.println("Exibindo página de músicas:");
                System.out.println(musicas);
            } else {
                System.out.println("A lista de músicas está vazia!");
            }
          }

          public static void main(String[] args) {
            
            ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
            reprodutorMusical.adicionarMusica("NOME 1", 212332);
            reprodutorMusical.adicionarMusica("NOME 2", 3263232);
            reprodutorMusical.exibirLista();
            reprodutorMusical.tocar("NOME 1");

            reprodutorMusical.pausar("NOME 1");


            
          }
        
       

       
    }

       
        
    

