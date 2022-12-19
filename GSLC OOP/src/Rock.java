import java.util.Random;

public class Rock extends Record implements Voucher{
	private String rock_subgenre;

	public Rock(String title, String artist_name, String album_name, String genre, int length, String producer_name,
			String record_label, int year_of_release, String rock_subgenre) {
		super(title, artist_name, album_name, genre, length, producer_name, record_label, year_of_release);
		this.rock_subgenre = rock_subgenre;
	}

	public String getRock_subgenre() {
		return rock_subgenre;
	}

	public void setRock_subgenre(String rock_subgenre) {
		this.rock_subgenre = rock_subgenre;
	}
	
	Random rand = new Random();
	
	@Override
	public int pricing() {
		int price = this.getYear_of_release() * 1000;
		return price;
	}

	@Override
	public int generateVoucher() {
		int genVoucher = 0;
		if(this.rock_subgenre.equals("Hard")) {
			int price = 1000000;
			int min = 100000;
			int max = 1500000;
			genVoucher = (int)(Math.random()*(max - min + 1) + min);
			System.out.println("Congrats! You just receive a " + genVoucher + " voucher!");
			
		}
		else if(this.rock_subgenre.equals("Soft")) {
			int price = 1250000;
			int min = 50000;
			int max = 200000;
			genVoucher = (int)(Math.random()*(max - min + 1) + min);
			System.out.println("Congrats! You just receive a " + genVoucher + " voucher!");
		}
		return genVoucher;
	}
	

}
