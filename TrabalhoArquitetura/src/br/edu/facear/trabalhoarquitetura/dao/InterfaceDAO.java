package br.edu.facear.trabalhoarquitetura.dao;

import java.util.List;

public interface InterfaceDAO<T> {
	public void salvar(T t);
	public void alterar(T t);
	public void excluir(T t);
	public List<T> listar();
}
