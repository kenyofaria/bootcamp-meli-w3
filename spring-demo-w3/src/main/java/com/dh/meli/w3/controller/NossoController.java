package com.dh.meli.w3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NossoController {

	@ResponseBody
	@GetMapping("/ping")    // url pattern; endpoint; servlet
	public String r() {
		return "novo pong";
	}
	
	@ResponseBody
	@GetMapping("/mais-ping")
	public String s() {
		return "mais um novo pong";
	}
	
	@ResponseBody
	@GetMapping("/anuncio")
	public Anuncio endPoint() {
		Anuncio anuncio = new Anuncio(10, "PS 5", 4000.00);
		return anuncio;
	}
}
