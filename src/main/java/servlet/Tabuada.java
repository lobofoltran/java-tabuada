package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "Tabuada",
    urlPatterns = {"/tabuada"}
)

/**
 * 
 * @author LAB121
 *
 */
public class Tabuada extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8458112374302474541L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setStatus(200);
        
        for (int aux = 1; aux <= 10; aux++) {
        	for (int i = 1; i <= 10; i++) {
	        	out.println(aux  +" * "+ i +" = "+ aux * i);
        	}
        }
    }
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    
}
