package com.lucas.bet.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.bet.model.UsuarioModel;

public interface UsuarioRepository  extends JpaRepository<UsuarioModel, UUID>{

}
