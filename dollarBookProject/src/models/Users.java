package models;

public class Users {
	private String email;
	private String username;
	private String password;
	private String birthDate;
	
	public Users(String email, String username, String password, String birthDate) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
}
