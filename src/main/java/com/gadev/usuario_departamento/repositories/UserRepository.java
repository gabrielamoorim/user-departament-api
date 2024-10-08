package com.gadev.usuario_departamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadev.usuario_departamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
