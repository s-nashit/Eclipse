package newServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletC extends HttpServlet{

	public void service (HttpServletRequest req,HttpServletResponse res) {
		String a = req.getParameter("name");
		System.out.println(a);
		
		
	}
}
