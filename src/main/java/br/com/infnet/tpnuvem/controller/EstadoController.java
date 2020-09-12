package br.com.infnet.tpnuvem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.infnet.tpnuvem.model.service.EstadoService;

@Controller
public class EstadoController {
	
	@Autowired private EstadoService service;
	
	@RequestMapping(value = "/estados", method = RequestMethod.GET)
	public String obterEstados(
			Model model
			) {
			model.addAttribute("estados", service.obterEstados());
			
		return "estados";
	}
	
	@RequestMapping(value = "/municipios", method = RequestMethod.GET)
	public String init() {
		return "municipios";
	}
	
	
	@RequestMapping(value = "/estados/{id}/municipios", method = RequestMethod.GET)
	public String obterMunicipios(
			Model model,
			@PathVariable Integer id
			) {
			model.addAttribute("municipios", service.obterMunicipios(id));
			model.addAttribute("estado", service.obterEstado(id));
			
			return "municipios";
			
	
			  
			 
	}

 
 
}
