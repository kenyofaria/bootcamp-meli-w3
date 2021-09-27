package br.com.meli.persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.meli.entity.Vendedor;
import br.com.meli.exception.PersistenceException;

/**
 * 
 * @author kenyo
 * esta implementacao nao obedece o minimo de boas praticas. contendo uma serie de duplicacoes de codigo e nao utilizando apis prontas.
 * aqueles que forem utilizar este codigo, pfv refatore-o
 */
public class VendedorPersistence {

	private File arquivo = new File("vendedores.txt");

	public void cadastro(Vendedor vendedor, boolean manter) throws IOException {
		String registro = vendedor.getCodigo() + ";" + vendedor.getCpf() + ";" + vendedor.getNome() + ";" + vendedor.getCidade()+ ";" + vendedor.getUf();
		
		try(FileOutputStream fos = new FileOutputStream(arquivo, manter);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw)
			){
			bw.append(registro);
			bw.newLine();
		}
	}
	
	public void cadastro(List<Vendedor> vendedores) throws IOException {
		try(FileOutputStream fos = new FileOutputStream(arquivo);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw)
			){
			bw.write("");
		}
		
		try(
			FileOutputStream fos = new FileOutputStream(arquivo);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw)
			){
			for (Vendedor vendedor : vendedores) {
				String registro = vendedor.getCodigo() + ";" + vendedor.getCpf() + ";" + vendedor.getNome() + ";" + vendedor.getCidade()+ ";" + vendedor.getUf();
				bw.append(registro);
				bw.newLine();
			}
		}
				
	}

	public List<Vendedor> listagem() {
		List<Vendedor> vendedoresExistentes = new ArrayList<>();
		
		List<String> registros = retornaRegistros();
		registros.forEach(registro -> {
			Vendedor vendedor = converte(registro);
			vendedoresExistentes.add(vendedor);
		});
		return vendedoresExistentes;
		
	}
	
	/**
	 * 
	 * @param registro
	 * @return um objeto vendedor correspondente a um registro vindo do arquivo
	 */
	private Vendedor converte(String registro) {
		String[] campos = registro.split(";");
		return new Vendedor(campos[0], campos[1], campos[2], campos[3], campos[4]);
	}
	
	private List<String> retornaRegistros() {
		List<String> registros = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(arquivo);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr)) {
			registros = new ArrayList<>();
			while(true) {
				String linha = br.readLine();
				if(linha==null) {
					break;
				}
				registros.add(linha);
			}
			
		} catch (FileNotFoundException e) {
			throw new PersistenceException("Arquivo nao encontrado");
		} catch(IOException e) {
			throw new PersistenceException("Erro fatal");
		}

		return registros;
	}
}
