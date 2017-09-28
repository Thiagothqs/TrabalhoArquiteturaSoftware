package br.edu.facear.trabalhoarquitetura.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.trabalhoarquitetura.entity.Funcionario;
import br.edu.facear.trabalhoarquitetura.facade.FuncionarioFacade;

/**
 * Servlet implementation class ListarEmpregadoServlet
 */
@WebServlet("/ListarEmpregadoServlet")
public class ListarFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarFuncionarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FuncionarioFacade facade = new FuncionarioFacade();
		
		String funcao = request.getParameter("funcao");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");

		List<Funcionario> listaFuncionario = facade.listar(funcao, estado, cidade);
		
		request.setAttribute("listaFuncao", listaFuncionario);
		
		String nextPage = "/quadrofuncionario.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FuncionarioFacade facade = new FuncionarioFacade();
		
		String funcao = request.getParameter("funcao");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		
		List<Funcionario> listaFuncionario = facade.listar(funcao, estado, cidade);
		
		//FALTA SET ATTRIBUTE DO TB_FUNCAO
		request.setAttribute("listaFuncao", listaFuncionario);
		
		String nextPage = "/quadrofuncionario.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
