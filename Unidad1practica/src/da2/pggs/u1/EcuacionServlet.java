package da2.pggs.u1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EcuacionServlet
 */
@WebServlet("/EcuacionServlet")
public class EcuacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EcuacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double valorX = Double.parseDouble(request.getParameter("valorX"));
		double valorY = Double.parseDouble(request.getParameter("valorY"));
		
		Ecuacion ecuacion = new Ecuacion();
		ecuacion.setValorX(valorX);
		ecuacion.setValorY(valorY); 
		
		request.setAttribute("op", ecuacion);
		RequestDispatcher dispacher = request.getRequestDispatcher("resultado_ecuacion.jsp"); 
		dispacher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
