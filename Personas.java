package pe.autonoma.app.entity;

public class Personas {

	private int persona_id;
	private String nombres;
	private String apellidos;
	private int edad;
	private String hobbies;
	
	
	
	public Personas(int persona_id, String nombres, String apellidos, int edad,
			String hobbies) {
		super();
		this.persona_id = persona_id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.hobbies = hobbies;
	}
	
	public int getPersona_id() {
		return persona_id;
		
	}
	public void setPersona_id(int persona_id) {
		this.persona_id = persona_id;
		
	}
	public String getNombres() {
		return nombres;
		
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
		
	}
	public String getHobbies() {
		return hobbies;
		
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
		
		
	}
	
	
	
	
	
	
}
