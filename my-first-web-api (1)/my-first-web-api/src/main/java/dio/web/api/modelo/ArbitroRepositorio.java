package dio.web.api.modelo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Repository
public class ArbitroRepositorio {

    public void salvar(Arbitro arbitro){
        System.out.println("Recebendo o usuário na camada de repositório.");
        System.out.println(arbitro);

    }
    public void atualizar(Arbitro arbitro){
        System.out.println("Recebendo o usuário na camada de repositório.");
        System.out.println(arbitro);
    }
    public void remover(Integer id){
        System.out.format("Recebendo o id: %s para excluir o usuário.", id);
    }
    public List <Arbitro> listarArbitros(){
        List <Arbitro> arbitros = new ArrayList<>();
        arbitros.add(new Arbitro("Anderson Daronco", "password"));
        return arbitros;
    }
    public void encontrarArbitro(Integer id){
        System.out.format("Recebendo o id: %s Para encontrar um usuário.", id);
    }
}