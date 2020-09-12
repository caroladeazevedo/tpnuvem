package br.com.infnet.tpnuvem.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.infnet.tpnuvem.model.negocio.Endereco;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface IEnderecoClient {
	
	

	@GetMapping("{cep}/json")
	public Endereco obterPorCep(@PathVariable String cep);

}
