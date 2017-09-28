package br.edu.facear.trabalhoarquitetura.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.trabalhoarquitetura.entity.Funcionario;
import br.edu.facear.trabalhoarquitetura.facade.FuncionarioFacade;

/**
 * Servlet implementation class FuncionarioServlet
 */
@WebServlet("/FuncionarioServlet")
public class FuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuncionarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String celular = request.getParameter("celular");
		String dataNascimento = request.getParameter("dataNascimento");
		String sexoString = request.getParameter("sexo");
		char sexo = sexoString.charAt(0);
		String rua = request.getParameter("rua");
		String cep = request.getParameter("cep");
		String bairro = request.getParameter("bairro");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String qualificacoes = request.getParameter("qualificacoes");
		String escolaridade = request.getParameter("escolaridade");
		String funcao = request.getParameter("funcao");
		
		new FuncionarioFacade().salvar(new Funcionario(null, nome, cpf, email, senha, celular, dataNascimento, sexo, rua, cep, bairro, estado, cidade, qualificacoes, escolaridade, funcao, true));
	}

}
