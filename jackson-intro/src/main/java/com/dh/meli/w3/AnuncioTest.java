package com.dh.meli.w3;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.map.JsonMappingException;

//import com.fasterxml.jackson.core.JsonGenerator;
//import org.codehaus.jackson.map.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class AnuncioTest {


	public static void main(String[] args) {
		Anuncio anuncio = new Anuncio("MLB234", "Calça Jeans 38", new BigDecimal(60));
		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		
		try {
			mapper.writeValue(new File("anuncios.json"), anuncio);
			String s = mapper.writeValueAsString(anuncio);
			System.out.println(s);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(JsonProcessingException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
//		try {
//			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File("anuncios.json"), true))); // append mode file writer
//			JsonGenerator g = mapper.getFactory().createGenerator(out);
//			g.writeStartObject();
//			mapper.write (anuncio);// writeValue(g, anuncio);
//			g.writeEndObject();
//		} catch (JsonGenerationException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
