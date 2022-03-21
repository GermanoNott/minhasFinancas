package com.germano.minhasfinancas.service.impl;

import org.springframework.stereotype.Service;

import com.germano.minhasfinancas.exception.RegraNegocioException;
import com.germano.minhasfinancas.model.entity.Usuario;
import com.germano.minhasfinancas.model.repository.UsuarioRepository;
import com.germano.minhasfinancas.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuário com este email.");
		}
		
	}
	

}
