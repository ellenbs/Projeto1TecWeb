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

import projeto.model.Users;

@WebServlet("/entrar")
public class entrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public entrar() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Views/entrar.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			DAO_Login dao = new DAO_Login();
			
			List<Users> lista = dao.getLista();
			
			Users user = new Users();
			
			user.setId(Integer.valueOf(request.getParameter("id")));
		
			user.setLogin(request.getParameter("login"));
			
			user.setSenha(Integer.valueOf(request.getParameter("senha")));
			
			for (Users user_da_lista : lista) {
				
				
				if (user_da_lista.getLogin().contentEquals(user.getLogin())) {
					
					
					if (user_da_lista.getSenha().equals(user.getSenha())) {
						

						
						RequestDispatcher dispatcher = request.getRequestDispatcher("/Tasks");
						dispatcher.forward(request, response);
					}
					
					else {
						
						System.out.println("Senha Incorreta");
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("/login");
						dispatcher.forward(request, response);
						
					}
					
				}
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
