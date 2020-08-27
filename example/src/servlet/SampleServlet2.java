package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet2
 */
@WebServlet("/SampleServlet2")
public class SampleServlet2 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = "tokoro";
		String[] messages = {"猫が好き", "コーヒーが好き", "ゲームしたい"};
		int index = (int) (Math.random() * 3);
		String message = messages[index];

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<titile>自己紹介</titile>");
		out.println("<head>");
		out.println("<body>");
		out.println("<p>" + name + "です" + "<br>" + message + "</p>");
		out.println("</body>");
		out.println("</html>");



	}

}
