package br.com.floricultura.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.floricultura.model.Banco;

/**
 * Servlet implementation class Remover
 */
@WebServlet("/Remover")
public class Remover extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		banco.delete(id);
		
		response.sendRedirect("Itens");
	}

}
