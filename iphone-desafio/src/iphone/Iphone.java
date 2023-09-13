package iphone;

import iphone.musica.ReprodutorMusical;
import iphone.navegador.NavegadorInternet;
import iphone.telefone.Aparelho;
import iphone.telefone.AparelhoTelefonico;

public class Iphone {

      
      public static void main(String[] args) {
            ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
            reprodutorMusical.adicionarMusica("NOME 3", 212132);
            reprodutorMusical.exibirLista();

            NavegadorInternet navegadorInternet = new NavegadorInternet();
            navegadorInternet.exibirPagina();

            AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
            aparelhoTelefonico.adicionarTelefone("NOME CONTATO 1", 212123);
            aparelhoTelefonico.ligar("NOME CONTATO 1");
          
      }
   
        
}

