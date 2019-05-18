import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter(); 
		String username = req.getParameter("usr"); 
		String password = req.getParameter("pass"); 
		if (username.equals("barohit") && password.equals("Password123")) {
			out.println("congratulations, you have logged in!"); 
		} else {
			out.println("Sorry, this username or password is incorrect"); 
		}
	}

}
