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
		FileOutputStream fos = new FileOutputStream(arquivo, manter);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.append(registro);
		bw.newLine();
		bw.close();
	}
	
	public void cadastro(List<Vendedor> vendedores) throws IOException {
		FileOutputStream x = new FileOutputStream(arquivo);
		OutputStreamWriter y = new OutputStreamWriter(x);
		BufferedWriter z = new BufferedWriter(y);
		z.write("");
		z.close();
		
		
		FileOutputStream fos = new FileOutputStream(arquivo, true);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		for (Vendedor vendedor : vendedores) {
			String registro = vendedor.getCodigo() + ";" + vendedor.getCpf() + ";" + vendedor.getNome() + ";" + vendedor.getCidade()+ ";" + vendedor.getUf();
			bw.append(registro);
			bw.newLine();
		}
		bw.close();
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
		Vendedor vendedor = new Vendedor(campos[0], campos[1], campos[2], campos[3], campos[4]);
		return vendedor;
	}
	
	private List<String> retornaRegistros() {
		FileInputStream fis;
		List<String> registros = new ArrayList<String>();
		try {
			fis = new FileInputStream(arquivo);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			registros = new ArrayList<String>();
			while(true) {
				String linha = br.readLine();
				if(linha==null) {
					break;
				}
				registros.add(linha);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Arquivo nao encontrado");
		} catch(IOException e) {
			e.printStackTrace();
		}

		return registros;
	}
}
