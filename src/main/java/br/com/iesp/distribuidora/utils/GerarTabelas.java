package br.com.iesp.distribuidora.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("distribuidora");
		EntityManager em = factory.createEntityManager();
		
	}
	
}
