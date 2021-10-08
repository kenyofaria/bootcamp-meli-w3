package br.com.meli.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.meli.entity.Anuncio;
import br.com.meli.entity.Pedido;
import br.com.meli.util.JPAUtil;


public class PedidoPersistence {
	
	
	private static void insercao() {
		EntityManager em = JPAUtil.getEntityManager();
		
		Anuncio cambio = em.find(Anuncio.class, "MLB37632890");
		Anuncio iphone = em.find(Anuncio.class, "MLB34567890");
		
		List<Anuncio> anuncios = Arrays.asList(cambio, iphone);
		
		Pedido pedido = new Pedido(LocalDate.now(), anuncios);
		em.getTransaction().begin();
		em.persist(pedido);
		em.getTransaction().commit();	
	}
	
	private static void atualiza() {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		Pedido pedido = em.find(Pedido.class, 2L);
		List<Anuncio> anuncios = pedido.getAnuncios();	
		anuncios.add(em.find(Anuncio.class, "MLB98779990"));
		
		pedido.setAnuncios(anuncios);
		em.getTransaction().commit();
	}
	
	private static void exclusao() {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		Pedido pedido = em.find(Pedido.class, 1L);
		em.remove(pedido);
		em.getTransaction().commit();
	}
	
	public static void main(String[] args) {
		
		atualiza();
	}
}
