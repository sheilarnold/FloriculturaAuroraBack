package br.com.floricultura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoItemServlet
 */
@WebServlet("/NovoItem")
public class NovoItemServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Sessão de cadastro de itens só aceita métodos post!");
	}
	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Cadastrando novo item");
    	String item = request.getParameter("item");
    	PrintWriter out = response.getWriter();
    	out.println("<html><body>Elemento recebido: " + item + "</body></html>");
    }

}
