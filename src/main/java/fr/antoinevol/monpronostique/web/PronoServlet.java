package fr.antoinevol.monpronostique.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PronoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final PrintWriter writer = response.getWriter();

		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>La france va gagner 2-0</h1>");
		writer.append("</body>");
		writer.append("</html>");
		writer.flush();
	}

}
