package br.com.iesp.distribuidora.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import br.com.iesp.distribuidora.model.Usuario;

public class UsuarioRepository {
	
	private static EntityManagerFactory factory;
	static {
		factory = Persistence.createEntityManagerFactory("distribuidora");
	}
	
	private EntityManager em;
	
	public Usuario save(Usuario usuario) {
		this.em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();
		return usuario;
	}
	
	public List<Usuario> findAll() {
		this.em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
		em.close();
		return usuarios;
	}
	
	public void remove(Long id) {
		this.em = factory.createEntityManager();
		em.getTransaction().begin();
		Usuario remove = em.find(Usuario.class, id);
		em.remove(remove);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(Usuario usuario) {
		this.em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
	}
	
	public Usuario getOne(Long id) {
		this.em = factory.createEntityManager();
		em.getTransaction().begin();
		Usuario find = em.find(Usuario.class, id);
		em.close();
		return find;
	}
	
}
