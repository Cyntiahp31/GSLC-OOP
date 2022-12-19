
public abstract class Record {

	private String title;
	private String artist_name;
	private String album_name;
	private String genre;
	private int record_length;
	private String producer_name;
	private String record_label;
	private int year_of_release;
	
	public Record(String title, String artist_name, String album_name, String genre, int record_length, String producer_name,
			String record_label, int year_of_release) {
		super();
		this.title = title;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.genre = genre;
		this.record_length = record_length;
		this.producer_name = producer_name;
		this.record_label = record_label;
		this.year_of_release = year_of_release;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	public String getAlbum_name() {
		return album_name;
	}
	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getRecord_length() {
		return record_length;
	}

	public void setRecord_length(int record_length) {
		this.record_length = record_length;
	}

	public String getProducer_name() {
		return producer_name;
	}
	public void setProducer_name(String producer_name) {
		this.producer_name = producer_name;
	}
	public String getRecord_label() {
		return record_label;
	}
	public void setRecord_label(String record_label) {
		this.record_label = record_label;
	}
	public int getYear_of_release() {
		return year_of_release;
	}
	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}
	
	public void showInfo() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Artist: " + this.getArtist_name());
		System.out.println("Album: " + this.getAlbum_name());
		System.out.println("Genre: " + this.genre);
		System.out.println("Record Length: " + this.getRecord_length());
		System.out.println("Producer: " + this.getProducer_name());
		System.out.println("Record Label: " + this.getRecord_label());
		System.out.println("Year of Release: " + this.getYear_of_release());
		
		System.out.println("=========================================");	
	}
	
	public abstract int pricing();

}
