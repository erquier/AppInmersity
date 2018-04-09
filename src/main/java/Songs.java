
public class Songs{
	
	private String title;
	private String artist;
	private int year;
	private String featuring;
	
	
	public Songs(String title, String artist, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getFeaturing() {
		return featuring;
	}
	public void setFeaturing(String featuring) {
		this.featuring = featuring;
	}
	
	
	
}
