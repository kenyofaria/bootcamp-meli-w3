package br.com.meli;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.meli.entity.Pedido;
import br.com.meli.repository.PedidoRepository;
import br.com.meli.repository.PedidoRepository.Anuncio;
import br.com.meli.repository.VendedorRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private VendedorRepository vendedorRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Pedido> pedidosDeHoje = pedidoRepository.getByData(LocalDate.now());
		
		pedidosDeHoje.forEach(p -> {
			System.out.println(p.getId() + "  " + p.getData().toString());
			List<Anuncio> anuncios = pedidoRepository.euQueroOsAnuncios(p.getId());
			anuncios.forEach(a -> System.out.println(a.getCodigo() + " " + a.getTitulo()));
		});
	}

}
