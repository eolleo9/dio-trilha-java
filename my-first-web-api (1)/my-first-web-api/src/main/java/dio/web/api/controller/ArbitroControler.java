package dio.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dio.web.api.modelo.Arbitro;
import dio.web.api.modelo.ArbitroRepositorio;

import java.util.List;

@RestController
public class ArbitroControler {
    @Autowired
    private ArbitroRepositorio repositorio;

    @PostMapping("/arbitros")
    public void postar(@RequestBody Arbitro arbitro){
        repositorio.salvar(arbitro);
    }
    @PutMapping("/arbitros")
    public void atualizarArbitros(@RequestBody Arbitro arbitro){
        repositorio.atualizar(arbitro);
    }
    @GetMapping("/arbitros")
    public List<Arbitro> listarTodos(){
        return repositorio.listarArbitros();
    }
    @GetMapping("/arbitros")
    public Arbitro procurarArbitro(@PathVariable("id")Integer id){
        return repositorio.encontrarArbitro(id); 
    }
    @DeleteMapping("/arbitros")
    public void deletar(@PathVariable("id")Integer id){
        repositorio.remover(id);
    }
    


    
}
