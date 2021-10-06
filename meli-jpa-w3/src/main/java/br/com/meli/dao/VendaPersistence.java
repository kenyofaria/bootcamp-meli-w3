package br.com.meli.dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.entity.FormaPagamento;
import br.com.meli.entity.Venda;
import br.com.meli.entity.Vendedor;
import br.com.meli.util.JPAUtil;

public class VendaPersistence {

	private EntityManager em;

	public VendaPersistence() {
		em = JPAUtil.getEntityManager();
	}

	public void insere(Venda venda) {
		try {
			em.getTransaction().begin();
			em.persist(venda);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			em.getTransaction().rollback();
		}
	}
	
	public Venda get(Long id) {
		return em.find(Venda.class, id);
	}
	
	public List<Venda> lista() {
		TypedQuery<Venda> qry = em.createQuery("from Venda", Venda.class);
		return qry.getResultList();
	}
	
	public void atualiza(Venda venda) {
		em.getTransaction().begin();
		Venda vendaParaSerAtualizada = em.find(Venda.class, venda.getId());
		vendaParaSerAtualizada.setFormaPagamento(venda.getFormaPagamento());
		em.getTransaction().commit();
	}
	
	public void deleta(Long id) {
		em.getTransaction().begin();
		Venda v = em.find(Venda.class, id); //garantindo que o objeto v esteja no estado managed
		em.remove(v);
		em.getTransaction().commit();
	}

	public static void main(String[] args) {
		VendaPersistence vendaPersistence = new VendaPersistence();
		VendedorPersistence vendedorPersistence = new VendedorPersistence();
		Vendedor vendedor = vendedorPersistence.get("MLB126");
		
		vendaPersistence.insere(new Venda(LocalDate.now(), new BigDecimal(1000), FormaPagamento.A_PRAZO, vendedor));
		
//		vendaPersistence.insere(new Venda(LocalDate.now(), new BigDecimal(1000), "A VISTA"));
//		List<Venda> lista = vendaPersistence.lista();
//		lista.forEach(v -> System.out.println(v.getData().toString().concat("  " + v.getValorTotal())));
		
//		Venda v = vendaPersistence.get(2L);
//		System.out.println(v.getData().toString().concat("  " + v.getValorTotal()));
		
//		Venda venda = new Venda(2L, LocalDate.now(), new BigDecimal(1000), "A PRAZO");
//		vendaPersistence.atualiza(venda);
		
//		vendaPersistence.deleta(2L);
		
	}
}
