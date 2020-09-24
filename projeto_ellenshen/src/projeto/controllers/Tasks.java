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

@WebServlet("/Tasks")
public class Tasks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Tasks() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    	try {
    		
    	DAO dao = new DAO();
    	List<Topicos> topicos = dao.getLista();
		
		request.setAttribute("topicos", topicos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/tasks.jsp");
		dispatcher.forward(request, response);
		dao.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
    } 	

}
