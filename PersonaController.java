package pe.autonoma.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import pe.autonoma.app.entity.Personas;
import pe.autonoma.app.model.PersonaModel;

/**
 * Servlet implementation class PersonaController
 */
@WebServlet("/PersonaController")
public class PersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/project")
	private DataSource dataSource;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Obtenemos directamente por metodo get la indicación para ver la vista "listaPersonas.jsp"
		Personas tempPersona = new Personas(0, request.getParameter("personas"), null, 0, null);
		
		boolean result = new PersonaModel().insertarPersona(dataSource,tempPersona);
		
		System.out.println(result);
		
		String pages = request.getParameter("page");
		
		
		if(pages.equals("lista")){
			List<Personas> listPersonas = new ArrayList<>();
			listPersonas = new PersonaModel().listPersonas(dataSource);
			request.setAttribute("listPersonas", listPersonas);
			request.setAttribute("title", "List of Personas");
			
			request.getRequestDispatcher("listaPersonas.jsp").forward(request, response);
		}		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
