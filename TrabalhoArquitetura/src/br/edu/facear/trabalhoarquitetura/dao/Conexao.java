package br.edu.facear.trabalhoarquitetura.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TrabalhoArquitetura");
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}
}
