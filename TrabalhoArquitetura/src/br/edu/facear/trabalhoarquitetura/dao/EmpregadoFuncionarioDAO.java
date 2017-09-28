package br.edu.facear.trabalhoarquitetura.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.facear.trabalhoarquitetura.entity.EmpregadoFuncionario;

public class EmpregadoFuncionarioDAO implements InterfaceDAO<EmpregadoFuncionario> {

	EntityManagerFactory emf = Conexao.getInstance();
	
	@Override
	public void salvar(EmpregadoFuncionario t) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(t);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(EmpregadoFuncionario t) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(t);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void excluir(EmpregadoFuncionario t) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(t);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<EmpregadoFuncionario> listarTodos() {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("from EmpregadoFuncionario");
		List<EmpregadoFuncionario> listaEmpregadoFuncionario = q.getResultList();
		
		em.getTransaction().commit();
		//em.close();
		
		return listaEmpregadoFuncionario;
	}
	
}
