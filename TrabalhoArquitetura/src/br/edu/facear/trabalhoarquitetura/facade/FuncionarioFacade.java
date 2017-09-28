package br.edu.facear.trabalhoarquitetura.facade;

import java.util.List;

import br.edu.facear.trabalhoarquitetura.dao.FuncionarioDAO;
import br.edu.facear.trabalhoarquitetura.entity.Funcionario;

public class FuncionarioFacade {
	FuncionarioDAO dao = new FuncionarioDAO();
	
	public void salvar(Funcionario funcionario) {
		if(!funcionario.getNome().isEmpty()) {
			dao.salvar(funcionario);
		}
	}
	
	public void excluir(Funcionario funcionario) {
		if(!funcionario.getNome().isEmpty()) {
			dao.excluir(funcionario);
		}
	}
	
	public List<Funcionario> listar(String funcao, String estado, String cidade){
		List<Funcionario> listaFuncionario=null;
	
		if(funcao == null && estado == null && cidade == null) {
			listaFuncionario = dao.listarTodos();
		}
		else if(funcao.isEmpty() && !estado.isEmpty() && !cidade.isEmpty()){
			listaFuncionario = dao.listar(estado, cidade);//where,"PR"
		}
		else if(!funcao.isEmpty() && estado.isEmpty() && cidade.isEmpty()){
			listaFuncionario = dao.listarFuncao(funcao);//where,"PR"
		}
		else if(!estado.isEmpty() && funcao.isEmpty() && cidade.isEmpty()){
			listaFuncionario = dao.listarEstado(estado);//where,"PR"
		}
		else if(!funcao.isEmpty() && !estado.isEmpty() && !cidade.isEmpty()){
			listaFuncionario = dao.listar(funcao, estado, cidade);//where,"PR"
		}
		else {
			listaFuncionario = dao.listarTodos();
		}
		
		return listaFuncionario;
	}
	
	public List<Funcionario> listarTodos(){
		return dao.listarTodos();
	}
	
	public Funcionario obterFuncionario(Long id) {
		Funcionario funcionario = dao.obterFuncionario(id);
		return funcionario;
	}
}
