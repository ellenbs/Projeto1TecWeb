package projeto.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.model.Users;


public class DAO_Login {
	
private Connection connection = null;
	
	public DAO_Login() throws ClassNotFoundException, SQLException {
		
	 Class.forName("com.mysql.jdbc.Driver");
	 connection = DriverManager.getConnection(
			 "jdbc:mysql://localhost/projeto1", "root", "");
	}
	
	public List<Users> getLista() throws SQLException {
		
		List<Users> users = new ArrayList<Users>();
		
		PreparedStatement stmt = connection.
		 prepareStatement("SELECT * FROM Users");
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
			Users user = new Users();
			
			user.setId(rs.getInt("id"));
			
			user.setLogin(rs.getString("login"));
			
			user.setSenha(rs.getInt("senha"));
			
			users.add(user);
			
		}
		
		rs.close();
		stmt.close();
		return users;
		
	}
	
	public void close() throws SQLException {
		connection.close();
		
	}
	
	public void adiciona(Users user) throws SQLException {
		
		String sql = "INSERT INTO Users" + "(login,senha) values(?,?)";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1,user.getLogin());
		
		stmt.setInt(2,user.getSenha());
		
		stmt.execute();
		
		stmt.close();
		
	}
	
	
	public void atualiza(Users user) throws SQLException {
		
		String sql = "UPDATE Users SET login=?,senha=? WHERE id=?";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, user.getLogin());
		
		stmt.setInt(2, user.getSenha());

		stmt.setInt(3, user.getId());
		
		stmt.execute();
		
		stmt.close();
		
	}
	
	public void remove(Integer id) throws SQLException {
		
		PreparedStatement stmt = connection
		 .prepareStatement("DELETE FROM Users WHERE id=?");
		
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
		
	}

}
