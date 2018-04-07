import java.util.ArrayList;

public class Artist {
	private String name;
	private ArrayList<String> role = new ArrayList<String>();
	
	
	
	
	public Artist(String name, ArrayList<String> role) {
		super();
		this.name = name;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getRole() {
		return role;
	}
	public void setRole(ArrayList<String> role) {
		this.role = role;
	}
		
}
