package br.edu.facear.trabalhoarquitetura.facade;

import br.edu.facear.trabalhoarquitetura.dao.EmpregadoDAO;
import br.edu.facear.trabalhoarquitetura.entity.Empregado;

public class EmpregadoFacade {
	EmpregadoDAO dao = new EmpregadoDAO();
	
	public void salvar(Empregado empregado) {
		if(!empregado.getNome().isEmpty()) {
			dao.salvar(empregado);
		}
	}
}
