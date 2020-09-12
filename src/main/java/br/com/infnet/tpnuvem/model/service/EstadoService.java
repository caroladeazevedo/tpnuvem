package br.com.infnet.tpnuvem.model.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.tpnuvem.clients.IEstadoClient;
import br.com.infnet.tpnuvem.model.negocio.Estado;
import br.com.infnet.tpnuvem.model.negocio.Municipio;
import br.com.infnet.tpnuvem.model.negocio.Regiao;



@Service
public class EstadoService {

	@Autowired private IEstadoClient client;
	
	public List<Estado> obterEstados() {
		return client.obterEstados();
	}
	
	public Estado obterEstado(Integer id) {
		return client.obterEstado(id);
	}

	public List<Municipio> obterMunicipios(Integer id) {
	 return client.obterMunicipios(id);
	}

}
