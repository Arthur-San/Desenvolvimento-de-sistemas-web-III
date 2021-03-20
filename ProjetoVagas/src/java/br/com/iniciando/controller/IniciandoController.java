/*
cadastrar
pesquisar
candidatar
renunciar
 */
package br.com.iniciando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IniciandoController {

    @RequestMapping("index")
    public String iniciando() {
        return "index";
    }

    @RequestMapping("cadastrar")
    public String cadastrar() {
        return "cadastrar";
    }

    @RequestMapping("candidatar")
    public String candidatar() {
        return "candidatar";
    }

    @RequestMapping("cadastrarVaga")
    public String cadastrarVaga() {
        return "cadastrarVaga";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
