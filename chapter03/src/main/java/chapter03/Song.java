package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String compuser;
	private int year;
	private int track;
	
	public Song(String title, String artist) {
		//this.title = title;
		//this.artist = artist;
		
		//some code...
		
		this(title,artist,null,null,0,0);
	}
	public Song(String title, String artist, String album, String compuser, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.compuser = compuser;
		this.album = album;
		this.year = year;
		this.track = track;
		
		//some code...
	}
	public void setTitle(String title) {
		this.title = title;
		
	}
	public String getTitle() {
		return title;
		
	}
	public void setArtist(String artist) {
		this.artist = artist;
		
	}
	public String getArtist() {
		return artist;
		
	}
	public void setCompuser(String compuser) {
		this.compuser = compuser;
		
	}
	public String getCompuser() {
		return compuser;
		
	}
	public void setAlbum(String album) {
		this.album = album;
		
	}
	public String getAlbum() {
		return album;
		
	}
	public void setYear(int year) {
		this.year = year;
		
	}
	public int getYear() {
		return year;
		
	}
	public void setTrack(int track) {
		this.track = track;	
	}
	public int getTrack() {
		return track;
		
	}
	public void show() {
		System.out.println("title : "+title+", artist : "+artist+", album : "+album+", compuser : "+compuser+", year : "+year+", track : "+track);
		
	}
	

}
