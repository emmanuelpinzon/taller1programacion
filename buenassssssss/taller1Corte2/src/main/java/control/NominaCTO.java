package control;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Nomina;

@WebServlet("/NominaCTO")
	public class NominaCTO extends HttpServlet {
	    private static final long serialVersionUID = 1L;

	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        request.getRequestDispatcher("index.jsp").forward(request, response);
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String nombre = request.getParameter("nombre");
	        double salario = Double.parseDouble(request.getParameter("salarioBasico"));
	        int dias = Integer.parseInt(request.getParameter("dias"));

	        Nomina nomina = new Nomina();
	        nomina.setNombre(nombre);
	        nomina.setSalarioBasico(salario);
	        nomina.setDias(dias);

	        double salarioFinal = nomina.calcularSalario();

	        request.setAttribute("salarioFinal", salarioFinal);
	        request.getRequestDispatcher("index.jsp").forward(request, response);
	    }
}
