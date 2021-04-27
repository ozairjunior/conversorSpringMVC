package br.com.unipe.aula.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aula.doa.MoedaDAO;
import br.com.unipe.aula.model.Moedas;

@Controller
public class WelcomeController {
	
	@Autowired
	private MoedaDAO dao;
	
	@RequestMapping(value= "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario(Model model) {
		model.addAttribute("moedas", new Moedas());
		return new ModelAndView("formulario");
	}
	
	@PostMapping(value = "/cadastro")
	public ModelAndView cadastrarMoeda(@ModelAttribute Moedas moedas) {
		
		dao= new MoedaDAO();
		dao.salvar(moedas);
		
		ModelAndView view = new ModelAndView("formulario");
		
		view.addObject("euro","1 euro equivale a: " + moedas.getEuro_cota() + " Ienes" );
		
		view.addObject("iene","1 iene equivale a: " + moedas.getIene_cota() + " Euros");
		
		view.addObject("ContaEuro","O valor de Iene para Euro é: " + moedas.resultadoEuro());
		view.addObject("ContaIene","O valor de Euro para Iene é: " + moedas.resultadoIene());
		
		view.addObject("mensagem", "Moedas cadastradas com sucesso!");		
		
		return view;
	}
}
