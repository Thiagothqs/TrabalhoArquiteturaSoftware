package br.edu.facear.trabalhoarquitetura.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.facear.trabalhoarquitetura.entity.Empregado;
import br.edu.facear.trabalhoarquitetura.facade.EmpregadoFacade;

/**
 * Servlet implementation class ClienteServlet
 */
@WebServlet("/ClienteServlet")
public class EmpregadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpregadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String funcao = request.getParameter("funcao");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		
		System.out.println("Passou");
		
		new EmpregadoFacade().salvar(new Empregado(null, nome, cpf, funcao, estado, cidade));
		
		System.out.println("Voando");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AVANTE GUERREIROS");
		/*String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String funcao = request.getParameter("funcao");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		
		System.out.println("Passou");
		
		//new EmpregadoFacade().salvar(new Empregado(null, nome, cpf, funcao, estado, cidade));
		
		System.out.println("Voando");*/
	}

}
