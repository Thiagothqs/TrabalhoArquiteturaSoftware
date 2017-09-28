package br.edu.facear.trabalhoarquitetura.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContratarFuncionarioServlet
 */
@WebServlet("/ContratarFuncionarioServlet")
public class ContratarFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContratarFuncionarioServlet() {
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
		String nomeEmpregador = request.getParameter("nomeEmpregador");
		String nomeFuncionario = request.getParameter("nomeFuncionario");
		String cidade = request.getParameter("cidade");
		String datacontrato = request.getParameter("datacontrato");
		String cargahoraria = request.getParameter("cargahoraria");
		String salario = request.getParameter("salario");
	}

}
