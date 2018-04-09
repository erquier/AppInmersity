
public class User {

	public String name;
	public String pass;
	public String email;
	
	
	public User(String name, String pass, String email) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInfo() {
		return this.name + " " + this.pass + " -- email: " + this.email;
	}
	
	
}
