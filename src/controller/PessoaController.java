package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Endereco;
import negocio.Pessoa;

public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Pessoa> pessoas;
	
    public PessoaController() {
    	pessoas = new ArrayList<Pessoa>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Endereco e = new Endereco(
				request.getParameter("logradouro"), 
				request.getParameter("numero"), 
				request.getParameter("complemento"), 
				request.getParameter("bairro"), 
				request.getParameter("municipio"), 
				request.getParameter("estado"), 
				request.getParameter("pais")
			);		
		Pessoa pessoa = new Pessoa(
				request.getParameter("nome"), 
				request.getParameter("sobrenome"), 
				e
			);
		pessoa.setIdade(Integer.valueOf(request.getParameter("idade")));
		pessoa.setPeso(Float.valueOf(request.getParameter("peso")));
		
		pessoas.add(pessoa);
		
		request.getRequestDispatcher("doacao.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("lista", pessoas);
		
		request.getRequestDispatcher("relatorio.jsp").forward(request, response);
	}
}
