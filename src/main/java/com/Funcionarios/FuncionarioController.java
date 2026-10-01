package com.Funcionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {
    @GetMapping("/funcionarios")
    public String funcionarios(){
        return "rota funcionarios";
    }
}
