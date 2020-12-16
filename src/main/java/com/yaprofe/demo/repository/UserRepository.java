package com.yaprofe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yaprofe.demo.model.Usuario;
@Repository
public interface UserRepository extends JpaRepository<Usuario,Integer> {
	
	Usuario findByUsername(String username);
}
