package projeto.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projeto.model.Topicos;
import projeto.model.Users;


@WebServlet("/cria")
public class cria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public cria() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/cria.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DAO dao1 = new DAO();
			DAO_Login dao2 = new DAO_Login();
			Topicos topico = new Topicos();
			
			List<Users> lista = dao2.getLista();
			
			topico.setTask(request.getParameter("task"));
			topico.setMateria(request.getParameter("materia"));
			
			for(Users user_da_lista : lista) {
				
				if (request.getParameter("login").contentEquals(user_da_lista.getLogin())) {
					topico.setLogin(request.getParameter("login"));
				}
					
			}
			
			dao1.adiciona(topico);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Tasks");
			dispatcher.forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
