
public class Indie extends Record implements Bonus{
	private String indie_subgenre;
	
	public Indie(String title, String artist_name, String album_name, String genre, int length, String producer_name,
			String record_label, int year_of_release, String indie_subgenre) {
		super(title, artist_name, album_name, genre, length, producer_name, record_label, year_of_release);
		this.indie_subgenre = indie_subgenre;
	}

	public String getIndie_subgenre() {
		return indie_subgenre;
	}
	public void setIndie_subgenre(String indie_subgenre) {
		this.indie_subgenre = indie_subgenre;
	}
	
	@Override
	public int pricing() {
		int price = 0;
		if(this.indie_subgenre.equals("Alternative")) {
			price = 300000;
		}
		else if(this.indie_subgenre.equals("Underground")) {
			price = 200000;
		}
		return price;
	}
	@Override
	public void getBonus() {
		if(this.indie_subgenre.equals("Alternative")) {
			System.out.println("Congrats! You get an official sweater merch of Phoebe Bridgers!");
		}
		else if(this.indie_subgenre.equals("Underground")) {
			System.out.println("Congrats! You get an official sweater merch of Vacations!");
		}
	}

}
