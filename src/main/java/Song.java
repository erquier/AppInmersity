
public class Song {
	private String name;
	private String song_title;
	private int year;
	
	
	
	public Song(String name, String song_title, int year) {
		super();
		this.name = name;
		this.song_title = song_title;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong_title() {
		return song_title;
	}
	public void setSong_title(String song_title) {
		this.song_title = song_title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
