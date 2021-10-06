package br.com.meli.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.entity.Endereco;
import br.com.meli.entity.Vendedor;
import br.com.meli.util.JPAUtil;

public class VendedorPersistence {

	private Connection cnx;
	private EntityManager em;
	
	public VendedorPersistence(){
		em = JPAUtil.getEntityManager();
	}
	
	public void atualiza(Vendedor vendedor) {

	}
	
	public List<Vendedor> lista(){
		TypedQuery<Vendedor> qry = em.createQuery("From Vendedor", Vendedor.class);
		return qry.getResultList();
	}
	
	
	public Vendedor get(String codigo) {
		return em.find(Vendedor.class, codigo);
	}
	
	public void insere(Vendedor vendedor) {
		em.getTransaction().begin();
		em.persist(vendedor);
		em.getTransaction().commit();
	}

	public void exclui(String codigo) {
		try {
			PreparedStatement ps = cnx.prepareStatement("delete from vendedores where codigo = ?");
			ps.setString(1, codigo);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
