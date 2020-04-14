package com.example.ac_02.controller;

import com.example.ac_02.entidade.Funcionario;
import com.example.ac_02.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){

        ModelAndView mv = new ModelAndView("funcionariosTela");
        mv.addObject("funcionarios", service.getFuncionarios());

        return  mv;
    }
    @PostMapping("/cadastro") //responsavel por pegar requisições do template4
    public String Cadastrar(@ModelAttribute Funcionario funci){

        service.CriaFuncionario(funci);
        return "redirect:/funcionarios"; 
    }


}