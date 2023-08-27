package br.com.appdahora.lanchonete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Controler é uma classe que vai receber uma requisição
@Controller
public class MeuPrimeiroController {
    @GetMapping("/oi") // caminho para chegar no método
    @ResponseBody // indica o que vai ser devolvido
    public String hello(){
        return "Oi, tudo bem?";
    }
}
