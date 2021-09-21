package br.com.meli.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.dto.ProfessorDTO;
import br.com.meli.entity.Professor;

@RestController
public class MainController {

	private Map<String, String> map = new HashMap<>();
	private Map<Long, Professor> mapaCompleto = new HashMap<>();

	public MainController() {
		map.put("kenyo", "faria");
		map.put("filipe", "vaz");
		map.put("mauri", "klein");
		map.put("joice", "lima");
		
		mapaCompleto.put(1L, new Professor("kenyo","faria",String.valueOf(ThreadLocalRandom.current().nextInt(100, 100000))));
		mapaCompleto.put(2L, new Professor("filipe","vaz",String.valueOf(ThreadLocalRandom.current().nextInt(100, 100000))));
		mapaCompleto.put(3L, new Professor("mauri","klein",String.valueOf(ThreadLocalRandom.current().nextInt(100, 100000))));
		mapaCompleto.put(4L, new Professor("joice","lima",String.valueOf(ThreadLocalRandom.current().nextInt(100, 100000))));
		
	}

	@GetMapping(value = "/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping(value = "/pessoa")
	public String end1(String nome) {
		if (nome.equalsIgnoreCase("kenyo")) {
			return "kenyo abadio crosara faria";
		} else {
			return "não é o kenyo";
		}
	}

	@GetMapping(value = "/pessoal")
	public String end2(String nome, String cargo) {
		if (nome.equalsIgnoreCase("kenyo") && cargo.equalsIgnoreCase("professor")) {
			return "professor: kenyo abadio crosara faria";
		} else {
			if (nome.equalsIgnoreCase("kenyo")) {
				return "aluno: kenyo abadio crosara faria";
			}
		}
		return "não é o kenyo";
	}

	@GetMapping(value = "/query")
	public String consulta(@RequestParam("q") String primeiroNome) {
		Optional<String> item = map.entrySet().stream().filter(e -> primeiroNome.equalsIgnoreCase(e.getKey()))
				.map(Map.Entry::getValue).findFirst();
		return item.get();
	}

	@PostMapping(value = "/cadastra")
	public void cadastrar(@RequestBody Professor payLoad) {

		map.put(payLoad.getPrimeiroNome(), payLoad.getUltimoNome());
	}

	@PutMapping(value = "/atualiza")
	public void atualizar(@RequestBody Professor payLoad) {
		map.put(payLoad.getPrimeiroNome(), payLoad.getUltimoNome());
	}

	@DeleteMapping(value = "/deleta/{i}")
	public void remover(@PathVariable("i") String nome) {
		map.remove(nome);
	}

	@GetMapping(value = "/professores/{id}")
	public ProfessorDTO get(@PathVariable("id") Long id) {
		ProfessorDTO dto = new ProfessorDTO();
		mapaCompleto .forEach((k, v) -> {
			if(k.equals(id)) {
				dto.setPrimeiroNome(v.getPrimeiroNome());
				dto.setUltimoNome(v.getUltimoNome());
			}
		});
		return dto;
	}
}
