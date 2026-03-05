package com.example.rh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.rh.repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    
    @Autowired
    FuncionarioRepository fr;

    @RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView abrirIndex() {
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Olá, Seja Bem Vinda(o) !";
        mv.addObject("msg",mensagem);
        return mv;
    
    }

    // Buscar funcionários na home
    @RequestMapping(value="", method=RequestMethod.POST)
    public ModelAndView buscarIndex(@RequestParam("buscar") String buscar){
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Resultado da Busca";
        mv.addObject("msg",mensagem);
        mv.addObject("funcionarios",fr.findByNomes(buscar));
        return mv;
    }
}
