package com.dh.meli.w3.oo.revisao.arquivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnuncioDAO implements Persistivel<Anuncio>{
	
	private File file;
	private ArquivoUtil arquivoUtil;
	
	public AnuncioDAO(String arquivo) {
		file = new File(arquivo);
		arquivoUtil = new ArquivoUtil(file);
	}

	
	@Override
	public void salva(Anuncio anuncio) {
		String registro = anuncio.getId() + ";" + anuncio.getTitulo() + ";" + anuncio.getPreco() + ";" + anuncio.getRelevancia();
		try {
			arquivoUtil.escreve(registro);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void salva(List<Anuncio> lista) {
		lista.forEach(anuncio -> salva(anuncio));
		arquivoUtil.fechaArquivo();
	}

	@Override
	public Anuncio obter(String id) {
		return null;
	}

	@Override
	public List<Anuncio> listagem() {
		List<Anuncio> anunciosExistentes = new ArrayList<>();
		try {
			List<String> registros = this.arquivoUtil.retornaRegistros();
			registros.forEach(registro -> {
				Anuncio anuncioConvertido = converte(registro);
				anunciosExistentes.add(anuncioConvertido);
			});
			return anunciosExistentes;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Anuncio converte(String registro) {
		String[] campos = registro.split(";");
		Anuncio anuncio = new Anuncio(Integer.valueOf(campos[0]), Integer.valueOf(campos[3]), campos[1], Double.valueOf(campos[2]));
		return anuncio;
		
	}
}
