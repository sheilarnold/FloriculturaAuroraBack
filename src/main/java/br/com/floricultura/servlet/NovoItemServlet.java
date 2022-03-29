package br.com.floricultura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.floricultura.model.Banco;
import br.com.floricultura.model.Item;

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
    	
    	Item item = new Item();
    	item.setNome(request.getParameter("nome"));
    	item.setDescricao(request.getParameter("descricao"));
    	item.setPreco_custo(Double.parseDouble(request.getParameter("preco")));
    	
    	Banco banco = new Banco();
    	banco.add(item);
    	
    	//String item = request.getParameter("item");
    	//PrintWriter out = response.getWriter();
    	//out.println("<html><body>Elemento recebido: " + item.getNome() + "</body></html>");
    	RequestDispatcher rd = request.getRequestDispatcher("/ViewItem.jsp");
    	request.setAttribute("nome", item.getNome());
    	request.setAttribute("descricao", item.getDescricao());
    	request.setAttribute("preco", item.getPreco_custo());
    	rd.forward(request, response);
    }

}
