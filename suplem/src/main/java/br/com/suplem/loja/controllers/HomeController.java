package br.com.suplem.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller Spring reconhece a classe como controler
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na home na suplem");
		return "home";
	}
}
