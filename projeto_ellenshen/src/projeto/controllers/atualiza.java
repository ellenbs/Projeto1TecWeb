package projeto.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projeto.model.Topicos;


@WebServlet("/atualiza")
public class atualiza extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public atualiza() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/atualiza.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			DAO dao = new DAO();
			Topicos topico = new Topicos();
			
			topico.setId(Integer.valueOf(request.getParameter("id")));
			topico.setTask(request.getParameter("task"));
			topico.setMateria(request.getParameter("materia"));
			topico.setLogin(request.getParameter("login"));
			dao.atualiza(topico);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Tasks");
			dispatcher.forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
