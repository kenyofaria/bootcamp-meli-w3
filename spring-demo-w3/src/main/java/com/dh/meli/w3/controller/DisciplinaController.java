package com.dh.meli.w3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dh.meli.w3.entity.Disciplina;

@Controller
public class DisciplinaController {

	@ResponseBody
	@RequestMapping(value = "/disciplinas/cadastro", method = RequestMethod.POST)
	public Disciplina cadastro(@RequestBody Disciplina disciplina) {
		
		return disciplina;
	}
}
