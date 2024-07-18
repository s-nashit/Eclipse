package redirect;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class registerC extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, {
		res.setContentType("text/html");
		
		HttpSession session = req.getSession();
		String 
		
		PrintWriter pw = res.getWriter();
		pw.println("register page - sendredirect ");
		
		}
	}
