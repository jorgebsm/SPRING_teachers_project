package com.yaprofe.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yaprofe.demo.model.Rol;
@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {

}
