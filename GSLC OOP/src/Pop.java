
public class Pop extends Record implements Bonus{

	private String pop_subgenre;

	public Pop(String title, String artist_name, String album_name, String genre, int length, String producer_name,
			String record_label, int year_of_release, String pop_subgenre) {
		super(title, artist_name, album_name, genre, length, producer_name, record_label, year_of_release);
		this.pop_subgenre = pop_subgenre;
	}
	

	public String getPop_subgenre() {
		return pop_subgenre;
	}


	public void setPop_subgenre(String subgenre) {
		this.pop_subgenre = pop_subgenre;
	}


	@Override
	public int pricing() {
		int price = 0;
		if(this.pop_subgenre.equals("Dance")) {
			price = 450000;
		}
		else if(this.pop_subgenre.equals("Ballad")) {
			price = 500000;
		}
		return price;
	}

	@Override
	public void getBonus() {
		
		if(this.pop_subgenre.equals("Dance")) {
			System.out.println("Congrats! You just receive Ariana Grande's 'Thank You, Next' CD!");
		}
		else if(this.pop_subgenre.equals("Ballad")) {
			System.out.println("Congrats! You just receive Adele's '25' CD!");
		}
		
	}

}
