/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaofra.springboot.OlaSpringBoot.controller;

import br.com.joaofra.springboot.OlaSpringBoot.dao.ContatoDAO;
import br.com.joaofra.springboot.OlaSpringBoot.entidade.Contato;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joaoassis
 */
@Controller
@RequestMapping("/contatos")
public class ContatoController {
    
    @Autowired
    private ContatoDAO contatos;
    
    @GetMapping
    public ModelAndView listar(){
        
        List<Contato> listaContatos = contatos.findAll();
        
        ModelAndView modelAndView = new ModelAndView("contatos");
        modelAndView.addObject("contatos",listaContatos);
        
        return modelAndView;
        
    }
    
}
