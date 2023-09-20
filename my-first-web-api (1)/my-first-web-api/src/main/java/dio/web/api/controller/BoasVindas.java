package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoasVindas {
    @GetMapping
    public String boasVindas(){
        return "Seja bem-vindo ao sistema de súmula:";
    }
    
}
