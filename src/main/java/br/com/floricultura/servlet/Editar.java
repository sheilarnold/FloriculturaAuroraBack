package br.com.floricultura.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.floricultura.model.Banco;
import br.com.floricultura.model.Item;

/**
 * Servlet implementation class Editar
 */
@WebServlet("/Editar")
public class Editar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Item item = banco.findById(id);
		
		request.setAttribute("item", item);
		RequestDispatcher rd = request.getRequestDispatcher("/Edit.jsp");
		rd.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Item item = new Item();
		Banco banco = new Banco();
		item = banco.findById(Integer.parseInt(request.getParameter("id")));
		
    	item.setNome(request.getParameter("nome"));
    	item.setDescricao(request.getParameter("descricao"));
    	item.setPreco_custo(Double.parseDouble(request.getParameter("preco")));
    	    	
    	response.sendRedirect("Itens");
		
	}

}
