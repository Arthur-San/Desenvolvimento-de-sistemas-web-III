/*
 * Classe utilizada como controller da API no padrão MVC
 */
package br.com.iniciando.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IniciandoProjetoControle {
    
    @RequestMapping("index")
    public String iniciando(){
        return "index";
    }
}
