package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aula.model.Moedas;

@Controller
public class WelcomeController {
	
	@RequestMapping(value= "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model) {
		model.addAttribute("moedas", new Moedas());
		return new ModelAndView("formulario");
	}
	
	
	@RequestMapping(value= "/formulario", method = RequestMethod.POST)
	public ModelAndView exibelocal(@ModelAttribute Moedas moedas) {
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("dolar","O valor da cotação do Dolar é: "+ moedas.getDolar_cota());
		
		view.addObject("real","O valor da cotação do Real é: "+ moedas.getReal_cota());
		
		view.addObject("ContaDolar","O valor em Dolares é: " + moedas.resultadoDolar());
		view.addObject("ContaReal","O valor em Reais é: " + moedas.resultadoReal());
		
		return view;
		
	}
}
