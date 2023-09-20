package dio.springboot.sumula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Cartoes {
    @Autowired
    private Jogador falta; 
    @Autowired
    private Jogador jogador;

    public void aplicarCartao(){
        System.out.println(falta);
        System.out.println("O cartão deverá ser aplicado à jogada!");
    }
    public void procurarJogador(){
        jogador.setNumero(11);
        System.out.println(jogador);
        System.out.println("Jogador recebe o cartão amarelo!");
    }

    
}