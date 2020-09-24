package projeto.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projeto.model.Topicos;


public class DAO {
	
private Connection connection = null;
	
	public DAO() throws ClassNotFoundException, SQLException {
		
	 Class.forName("com.mysql.jdbc.Driver");
	 connection = DriverManager.getConnection(
			 "jdbc:mysql://localhost/projeto1", "root", "");
	}
	
	public List<Topicos> getLista() throws SQLException {
		
		List<Topicos> topicos = new ArrayList<Topicos>();
		
		PreparedStatement stmt = connection.
		 prepareStatement("SELECT * FROM Topicos");
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			
			Topicos topico = new Topicos();
			
			topico.setId(rs.getInt("id"));
			
			topico.setTask(rs.getString("task"));
			
			topico.setMateria(rs.getString("materia"));
			
			topico.setLogin(rs.getString("login"));
			
			topicos.add(topico);
			
		}
		
		rs.close();
		stmt.close();
		return topicos;
		
	}
	
	public void close() throws SQLException {
		connection.close();
		
	}
	
	public void adiciona(Topicos topico) throws SQLException {
		
		String sql = "INSERT INTO Topicos" + "(task,materia,login) values(?,?,?)";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1,topico.getTask());
		stmt.setString(2,topico.getMateria());
		stmt.setString(3,topico.getLogin());
		
		stmt.execute();
		
		stmt.close();
		
	}
	
	
	public void atualiza(Topicos topico) throws SQLException {
		
		String sql = "UPDATE Topicos SET task=?,materia=?,login=? WHERE id=?";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setString(1, topico.getTask());
		
		stmt.setString(2, topico.getMateria());
		
		stmt.setString(3, topico.getLogin());

		stmt.setInt(4, topico.getId());
		
		stmt.execute();
		
		stmt.close();
		
	}
	
	public void remove(Integer id) throws SQLException {
		
		PreparedStatement stmt = connection
		 .prepareStatement("DELETE FROM Topicos WHERE id=?");
		
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
		}

}
