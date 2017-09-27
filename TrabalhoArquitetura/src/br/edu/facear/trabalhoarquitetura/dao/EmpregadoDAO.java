package br.edu.facear.trabalhoarquitetura.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.facear.trabalhoarquitetura.entity.Empregado;

public class EmpregadoDAO implements InterfaceDAO<Empregado> {
	EntityManagerFactory emf = Conexao.getInstance();

	@Override
	public void salvar(Empregado empregado) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(empregado);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Empregado empregado) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(empregado);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void excluir(Empregado empregado) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(empregado);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<Empregado> listar() {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("SELECT * FROM EMPREGADO;");
		
		em.getTransaction().commit();
		em.close();
		
		return q.getResultList();
	}
	
	
}
