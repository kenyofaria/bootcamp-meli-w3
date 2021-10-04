package br.com.meli.service.integration.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
public class PedidoControllerTest {

	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void deveCadastrarUmPedido() throws Exception {
		
		String payLoad = 	"{\n"
				+ "				\"numero\": \"456789\",\n"
				+ "				\"data\":\"2021-10-01\",\n"
				+ "				\"total\":670.00,\n"
				+ "				\"itens\":[\n"
				+ "					{\n"
				+ "						\"descricao\":\"luvas de boxe\",\n"
				+ "						\"preco\":300\n"
				+ "					}\n"
				+ "				],\n"
				+ "				\"status\":\"PAGO\"\n"
				+ "			}";
		
		 mockMvc.perform(
		            MockMvcRequestBuilders.post("http://localhost:8080/pedidos")
		                    .contentType(MediaType.APPLICATION_JSON)
		                    .content(payLoad))
		            .andExpect(MockMvcResultMatchers.status().isOk());
	}
	
}
