package br.com.floricultura.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.floricultura.model.Banco;
import br.com.floricultura.model.Item;

/**
 * Servlet implementation class ViewItens
 */
@WebServlet("/Itens")
public class ViewItens extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Item> lista = banco.list();
		
		/*PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<ul>");
		
		for (Item item : lista) {
			out.println("<li>Item: " + item.getNome());
			out.println("<ul>");
			out.println("<li>Descrição: " + item.getDescricao() + "</li>");
			out.println("<li>Preço de custo: " + item.getPreco_custo() + "</li>");
			out.println("</ul>");
			out.println("</li>");
		}
		
		out.println("</ul>");
		out.println("</body></html>");
		*/
		request.setAttribute("itens", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/Itens.jsp");
    	rd.forward(request, response);
		
	}

}
