package br.com.infnet.tpnuvem.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.tpnuvem.model.negocio.Estado;
import br.com.infnet.tpnuvem.model.negocio.Municipio;

@FeignClient(url= "https://servicodados.ibge.gov.br/api/v1/localidades/estados", name = "estadoClient")
public interface IEstadoClient {

	@GetMapping 
	List<Estado> obterEstados();
	
	@GetMapping("/{id}")
	Estado obterEstado(@PathVariable Integer id);
	
	@GetMapping("/{id}/municipios")
	List<Municipio> obterMunicipios(@PathVariable Integer id);
}
