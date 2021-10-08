package br.com.meli.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.meli.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	List<Pedido> getByData(LocalDate data);

	@Query(value = "select a.codigo, a.titulo, a.vendedor_codigo,"
			+ " a.preco, a.data_anuncio, a.num_vendas "
			+ " from anuncios a, pedido_anuncios pa, pedido p "
			+ " where a.codigo = pa.anuncios_codigo "
			+ " and pa.pedido_id = p.id"
			+ " and p.id =:id",nativeQuery = true)
	
	List<Anuncio> euQueroOsAnuncios(@Param("id") Long id);
	
	
	public interface Anuncio{
		String getCodigo();
		String getTitulo();
		String getVendedor_Codigo();
		BigDecimal getPreco();
		LocalDate getData_Anuncio();
		int getNum_Vendas();
	}
	
	
//	@Query(value = "select a From Anuncio a, PedidoAnuncio pa, Pedido p\n"
//			+ "where a.codigo = pa.anuncio.codigo\n"
//			+ "and pa.pedido.id = p.id")
//	List<Anuncio> pegaAnuncios();
}
