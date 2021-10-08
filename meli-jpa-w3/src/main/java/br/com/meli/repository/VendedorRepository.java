package br.com.meli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meli.entity.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, String>{

	Vendedor findByNome(String nome);
}
