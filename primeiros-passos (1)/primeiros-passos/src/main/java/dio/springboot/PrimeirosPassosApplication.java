package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.sumula.Cartoes;

import dio.springboot.sumula.Cartoes;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
	@Bean
		public CommandLineRunner run(Cartoes cartoes) throws Exception{
			return args -> {
				cartoes.aplicarCartao();
				cartoes.procurarJogador();

				


			};

		}
		

}
