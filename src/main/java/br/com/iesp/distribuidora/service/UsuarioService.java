package br.com.iesp.distribuidora.service;

import java.util.List;

import javax.persistence.PersistenceContext;

import br.com.iesp.distribuidora.model.Usuario;
import br.com.iesp.distribuidora.repository.UsuarioRepository;

public class UsuarioService {

	private UsuarioRepository usuarioRepository;
	
	public UsuarioService() {
		this.usuarioRepository = new UsuarioRepository();
	}
	
	public List<Usuario> findAll() {
		return this.usuarioRepository.findAll();
	}
	
	public Usuario save(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}
	
	public void remove(Long id) {
		this.usuarioRepository.remove(id);
	}
	
	public void update(Usuario usuario) {
		this.usuarioRepository.update(usuario);
	}
	
	public Usuario getOne(Long id) {
		return this.usuarioRepository.getOne(id);
	}
	
}
