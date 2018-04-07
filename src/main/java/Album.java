import java.util.ArrayList;

public class Album {

	private String artist;
	private String album_name;
	private ArrayList<String> genre = new ArrayList<String>();
	private int year;
	

	public Album(String artist, String album_name, ArrayList<String> genre, int year) {
		super();
		this.artist = artist;
		this.album_name = album_name;
		this.genre = genre;
		this.year = year;
	}
	
	


	public Album(String artist, String album_name, int year) {
		super();
		this.artist = artist;
		this.album_name = album_name;
		this.year = year;
	}




	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSong_title() {
		return album_name;
	}
	public void setSong_title(String song_title) {
		this.album_name = song_title;
	}
	public ArrayList<String> getGenre() {
		return genre;
	}
	public void setGenre(ArrayList<String> genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	
	
}
