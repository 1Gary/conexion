package pe.autonoma.app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import pe.autonoma.app.entity.Personas;

public class PersonaModel {
	
	public List<Personas> listPersonas(DataSource dataSource) {
		// Step 1: Initialize connection objects
		List<Personas> listPersonas = new ArrayList<>(); 
        Connection connect = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
			connect = dataSource.getConnection();
			
			// Step 2: Create a SQL statements string
			String query = "Select * from personas";
			stmt = connect.createStatement();

			// Step 3: Execute SQL query
			rs = stmt.executeQuery(query);
         
			// Step 4: Process the result set
			while(rs.next()){
				listPersonas.add(new Personas(rs.getInt("persona_id"), 
											rs.getString("nombres"),
											rs.getString("apellidos"),
											rs.getInt("edad"),
											rs.getString("hobbies")));
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return listPersonas;
	}
	
	public boolean insertarPersona(DataSource dataSource, Personas persona){
		Connection connect = null;
        Statement stmt = null;
        ResultSet rs = null;


        try {
			connect = dataSource.getConnection();
			
			PreparedStatement st = connect.prepareStatement("insert into personas values(?, ?, ?, ?, ?)"); 
			
			st.setInt(1,20);
			st.setString(2,"Maria");//persona.getNombre();
			st.setString(3,"Torres Chavez"); //persona.getApellidos()
			st.setInt(4,24);
			st.setString(5,"Jugar Baila, programar");
			
			st.setInt(1,15);
			st.setString(2,"Julian");//persona.getNombre();
			st.setString(3,"Torres gomez"); //persona.getApellidos()
			st.setInt(4,24);
			st.setString(5,"Jugar, programar");
			
			st.setInt(1,5);
			st.setString(2,"Damian");//persona.getNombre();
			st.setString(3,"Lopez Fernandez"); //persona.getApellidos()
			st.setInt(4,12);
			st.setString(5,"Comer,Cantar ");
			
		
			
			st.executeUpdate(); 

			// Close all the connections 
			st.close(); 
			connect.close(); 
			     
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}
    


		
}
