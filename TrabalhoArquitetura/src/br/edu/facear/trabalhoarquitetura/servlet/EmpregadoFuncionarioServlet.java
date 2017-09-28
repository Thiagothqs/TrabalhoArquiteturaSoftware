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
 * Servlet implementation class EmpregadoFuncionarioServlet
 */
@WebServlet("/EmpregadoFuncionarioServlet")
public class EmpregadoFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpregadoFuncionarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FuncionarioFacade facade = new FuncionarioFacade();
		
		Long id = Long.parseLong(request.getParameter("id"));
		System.out.println("Id pego ->"+id);
		
		Funcionario funcionario = facade.obterFuncionario(id);
		request.setAttribute("funcionario", funcionario);
		
		String nextPage = "/contratarfuncionario.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
