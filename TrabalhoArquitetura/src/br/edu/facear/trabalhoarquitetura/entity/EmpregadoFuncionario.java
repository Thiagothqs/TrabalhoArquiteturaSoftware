package br.edu.facear.trabalhoarquitetura.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_empregadofuncionario")
public class EmpregadoFuncionario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int idEmpregado;
	private int idFuncionario;
	private String cidade;
	private String datacontrato;
	private String datademissao;
	private int cargahoraria;
	private float salario;
	
	public EmpregadoFuncionario(int id, int idEmpregado, int idFuncionario, String cidade, 
		String datacontrato, String datademissao, int cargahoraria, float salario) {
		super();
		this.id = id;
		this.idEmpregado = idEmpregado;
		this.idFuncionario = idFuncionario;
		this.cidade = cidade;
		this.datacontrato = datacontrato;
		this.datademissao = datademissao;
		this.cargahoraria = cargahoraria;
		this.salario = salario;
	}
	
	public EmpregadoFuncionario() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEmpregado() {
		return idEmpregado;
	}
	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getDatacontrato() {
		return datacontrato;
	}
	public void setDatacontrato(String datacontrato) {
		this.datacontrato = datacontrato;
	}
	public String getDatademissao() {
		return datademissao;
	}
	public void setDatademissão(String datademissao) {
		this.datademissao = datademissao;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalarioFuncionario(float salario) {
		this.salario = salario;
	}
}
