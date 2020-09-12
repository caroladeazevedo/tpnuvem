package br.com.infnet.tpnuvem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import br.com.infnet.tpnuvem.model.service.EnderecoService;


@SpringBootApplication
@EnableFeignClients
public class TpnuvemApplication {
	
	//@Autowired private EnderecoService service;

	public static void main(String[] args) {
		SpringApplication.run(TpnuvemApplication.class, args);
	}

	/*
	 * @Bean public CommandLineRunner run(EnderecoService service) throws Exception
	 * {
	 * 
	 * return args -> { System.out.println("Endereço: " +
	 * service.obterPorCep("123123")); };
	 * 
	 * }
	 */
	 
	
}
