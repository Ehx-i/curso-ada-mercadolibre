package modulo1.ejercicios.minibank.model.accountbank.model;

public class User {
	
	private String idUser;
	private String name, lasName;
	private String dni;
	private String email;
	
	public User(String idUser, String name, String lasName, String dni, String email) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.lasName = lasName;
		this.dni = dni;
		this.email = email;
	}

	public User() {
		super();
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
