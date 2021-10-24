package br.com.meli.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.entity.Venda;

@RestController
@RequestMapping("/vendas")
public class VendaController {

	@GetMapping
	public ResponseEntity<List<Venda>> listaDeVendas() {
		List<Venda> vendas = Arrays.asList(
				new Venda(LocalDate.parse("2021-01-10"), "MLB876", "MLB098", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-11"), "MLB876", "MLB097", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-12"), "MLB876", "MLB096", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-13"), "MLB876", "MLB095", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-14"), "MLB876", "MLB094", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-15"), "MLB876", "MLB093", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-16"), "MLB876", "MLB093", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-17"), "MLB876", "MLB092", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-18"), "MLB876", "MLB093", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-19"), "MLB876", "MLB093", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-20"), "MLB876", "MLB099", new BigDecimal(40)),
				new Venda(LocalDate.parse("2021-01-21"), "MLB876", "MLB100", new BigDecimal(40)));
		return ResponseEntity.ok(vendas);
	}
}
