package br.edu.facear.trabalhoarquitetura.dao;

import br.edu.facear.trabalhoarquitetura.entity.Empregado;

public class FactoryDAO {
	public InterfaceDAO<Empregado> createEmpregadoDAO(){
		return new EmpregadoDAO();
	}
}
