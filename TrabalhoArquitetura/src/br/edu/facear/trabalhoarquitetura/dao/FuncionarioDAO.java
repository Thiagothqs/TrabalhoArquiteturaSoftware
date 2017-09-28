package br.edu.facear.trabalhoarquitetura.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.facear.trabalhoarquitetura.entity.Funcionario;

public class FuncionarioDAO implements InterfaceDAO<Funcionario> {
	EntityManagerFactory emf = Conexao.getInstance();

	@Override
	public void salvar(Funcionario funcionario) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(funcionario);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void alterar(Funcionario funcionario) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(funcionario);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void excluir(Funcionario funcionario) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.remove(funcionario);
		
		em.getTransaction().commit();
		em.close();
	}

	public List<Funcionario> listar(String funcao, String estado, String cidade) {//String where, Object... args
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("select e FROM Funcionario e where e.estado = ? and e.cidade = ? and e.funcao = ?");// + where
		
		q.setParameter(0, estado);//index++, arg
		q.setParameter(1, cidade);
		q.setParameter(2, funcao);
		
		em.getTransaction().commit();
		//em.close();
		
		return q.getResultList();
	}
	
	public List<Funcionario> listar(String estado, String cidade) {//String where, Object... args
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("select e FROM Funcionario e where e.estado = ? and e.cidade = ?");// + where
		
		q.setParameter(0, estado);//index++, arg
		q.setParameter(1, cidade);

		em.getTransaction().commit();
		//em.close();
		
		return q.getResultList();
	}
	
	public List<Funcionario> listarEstado(String estado) {//String where, Object... args
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("select e FROM Funcionario e where e.estado = ?");// + where
		
		q.setParameter(0, estado);//index++, arg
		
		em.getTransaction().commit();
		//em.close();
		
		return q.getResultList();
	}
	
	public List<Funcionario> listarFuncao(String funcao) {//String where, Object... args
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("select e FROM Funcionario e where e.funcao = ?");// + where
		
		q.setParameter(0, funcao);//index++, arg
		
		em.getTransaction().commit();
		//em.close();
		
		return q.getResultList();
	}
	
	@Override
	public List<Funcionario> listarTodos(){
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createQuery("from Funcionario");
		List<Funcionario> listaFuncionario = q.getResultList();
		
		em.getTransaction().commit();
		return listaFuncionario;
	}
	
	public Funcionario obterFuncionario(Long id) {
		Funcionario funcionario = new Funcionario();
		List<Funcionario> listaFuncionario = listarTodos();
		
		for(int i=0; i<listaFuncionario.size();i++) {
			if(id==listaFuncionario.get(i).getId()){
				funcionario = listaFuncionario.get(i);
			}
		}
		
		return funcionario;
	}
}
