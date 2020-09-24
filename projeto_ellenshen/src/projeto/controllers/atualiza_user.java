package projeto.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projeto.model.Users;

@WebServlet("/atualiza_user")
public class atualiza_user extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public atualiza_user() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/atualiza_user.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			DAO_Login dao = new DAO_Login();
			Users user = new Users();
			
			user.setId(Integer.valueOf(request.getParameter("id")));
		
			user.setLogin(request.getParameter("login"));
			
			user.setSenha(Integer.valueOf(request.getParameter("senha")));
			
			dao.atualiza(user);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login");
			dispatcher.forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
