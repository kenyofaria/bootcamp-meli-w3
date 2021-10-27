package br.com.meli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meli.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, String>{

	Usuario findByUser(String user);
	
}
