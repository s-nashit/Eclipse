package redirect;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//class abc{
//	public void new1(int a, int b) {
//		System.out.println(a*b);
//	}
//}

@webServlet("/login")
public class patnaC extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, {
		String name = req.getParameter("name");
		double eng = Interger.parseInt(req.getParameter("eng"));
		double maths = Interger.parseInt(req.getParameter("maths"));
		
		req.setAttribute("key1",name);
		RequestDispatcher 
		
		
		res.setContentType("text/html");
		
		
		PrintWriter pw = res.getWriter();
		pw.println("<h1 style= 'color:red'>"+name + " registered"+"</h1>");
	}

}

