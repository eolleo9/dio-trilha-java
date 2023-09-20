package dio.springboot.sumula;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")

    public Jogador jogador () {
        System.out.println("CRIANDO UMA NOVA SITUAÇÃO DE FALTA!");
        Jogador jogador = new Jogador();
        jogador.setNome("NEYMAR");
        jogador.setNumero(11);
        return jogador;

    }

    
}