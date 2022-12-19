// Program ini adalah program yang dirancang untuk pengelolaan sebuah 
// record store (toko kaset/rekaman). Tujuan program ini adalah untuk 
// menampilkan daftar kaset/rekaman yang ada di toko, menambah 
// stok kaset/rekaman, dan membeli kaset/rekaman.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Record> record = new ArrayList<>();
	
	public Main() {
		int input;
		
		do {
			
			System.out.println("SIDELINES RECORD STORE"); 
			System.out.println("======================");
			System.out.println("1. View Records");
			System.out.println("2. Add New Record");
			System.out.println("3. Buy Record");
			System.out.println("4. Exit");
			
			input = scan.nextInt(); scan.nextLine();
			if(input == 1) {
				viewRecords();
			}
			else if(input == 2) {
				addRecord();
			}
			else if(input == 3) {
				buyRecord();
			}
			
		}while(input != 4);
	}
	
	public void viewRecords() {
		
		// Jika arrayList masih kosong, print "NO DATA"
		if(record.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("Press Enter to Continue!");
			scan.nextLine();
		}
		// Jika arrayList ada isinya, maka print semua isinya
		else {
			System.out.println("=============================================================");
			for(int i = 0; i < record.size(); i++) {
				System.out.println("No: " + (i+1));
				System.out.println("Title: " + record.get(i).getTitle());
				System.out.println("Artist: " + record.get(i).getArtist_name());
				System.out.println("Album: " + record.get(i).getAlbum_name());
				System.out.println("Genre: " + record.get(i).getGenre());
				System.out.println("Record Length: " + record.get(i).getRecord_length());
				System.out.println("Producer: " + record.get(i).getProducer_name());
				System.out.println("Label: " + record.get(i).getRecord_label());
				System.out.println("Year of Release: " + record.get(i).getYear_of_release());
				
				// Print subgenre berdasarkan masing-masing genre
				if(record.get(i) instanceof Indie) {
					System.out.println("Subgenre: " + ((Indie)record.get(i)).getIndie_subgenre());
				}
				else if(record.get(i) instanceof Pop) {
					System.out.println("Subgenre: " + ((Pop)record.get(i)).getPop_subgenre());
				}
				else if(record.get(i) instanceof Rock) {
					System.out.println("Subgenre: " + ((Rock)record.get(i)).getRock_subgenre());
				}
			}
			System.out.println("=============================================================");
			System.out.println("");
			System.out.println("Press Enter to Continue!");
			scan.nextLine();
		}
	}
	
	public void addRecord() {
		
		// Variabel untuk menyimpan hasil inputan user
		
		String title;
		String artist_name;
		String album_name;
		String genre;
		int record_length;
		String producer_name;
		String record_label;
		int year_of_release;
		String subgenre;
		
		// Input title rekaman
		do {
			System.out.println("Input the title of the record [3-50]: ");				//
			title = scan.nextLine();
		}while(title.length() < 3 || title.length() > 50);
		
		// Input nama penyanyi
		do {
			System.out.println("Input the name of the artist [3-20]: ");
			artist_name = scan.nextLine();
		}while(artist_name.length() < 3 || artist_name.length() > 20);
		
		// Input judul album
		do {
			System.out.println("Input album title [3-20]: ");
			album_name = scan.nextLine();
		}while(album_name.length() < 3 || album_name.length() > 20);
		
		// Input genre
		do {
			System.out.println("Input genre [Indie | Pop | Rock]: ");
			genre = scan.nextLine();
		}while(!(genre.equals("Indie") || genre.equals("Pop") || genre.equals("Rock")));
		
		// Input durasi rekaman
		do {
			System.out.println("Input record's length in seconds [10-2000]: ");
			record_length = scan.nextInt(); scan.nextLine();
		}while(record_length < 10 || record_length > 2000);
		
		// Input nama produser
		do {
			System.out.println("Input the producer's name [3-20]: ");
			producer_name = scan.nextLine();
		}while(producer_name.length() < 3 || producer_name.length() > 20);
		
		// Input nama label rekaman
		do {
			System.out.println("Input record label [Dead Ocean | Universal Music | Nettwerk]: ");
			record_label = scan.nextLine();
		}while(!(record_label.equals("Dead Ocean") || record_label.equals("Universal Music") || record_label.equals("Nettwerk") || genre.equals("Folk")));
		
		// Input tahun dirilisnya rekaman
		do {
			System.out.println("Input year of release [1970-2022]: ");
			year_of_release = scan.nextInt(); scan.nextLine();
		}while(year_of_release < 1970 || year_of_release > 2022);
		
		
		// Jika genrenya indie, maka user diminta untuk memasukkan subgenre antara "Alternative" dan "Underground"
		if(genre.equals("Indie")) {
			do {
				System.out.println("Input indie subgenre [Alternative | Underground]: ");
				subgenre = scan.nextLine();
			}while(!(subgenre.equals("Underground") || subgenre.equals("Alternative")));
			record.add(new Indie(title, artist_name, album_name, genre, record_length, producer_name, record_label, year_of_release, subgenre));
			// Tambahkan rekaman ke dalam arrayList
		}
		
		// Jika genrenya pop, maka user diminta untuk memasukkan subgenre antara "Dance" dan "Ballad"
		else if(genre.equals("Pop")) {
			do {
				System.out.println("Input pop subgenre [Dance | Ballad]: ");
				subgenre = scan.nextLine();
			}while(!(subgenre.equals("Dance") || subgenre.equals("Ballad")));
			record.add(new Pop(title, artist_name, album_name, genre, record_length, producer_name, record_label, year_of_release, subgenre));
			// Tambahkan rekaman ke dalam arrayList
		}
		
		// Jika genrenya pop, maka user diminta untuk memasukkan subgenre antara "Dance" dan "Ballad"
		else if(genre.equals("Rock")) {
			do {
				System.out.println("Input rock subgenre [Hard | Soft]: ");
				subgenre = scan.nextLine();
			}while(!(subgenre.equals("Hard") || subgenre.equals("Soft")));
			record.add(new Rock(title, artist_name, album_name, genre, record_length, producer_name, record_label, year_of_release, subgenre));
			// Tambahkan rekaman ke dalam arrayList
		}
		
		System.out.println("");
		System.out.println("Record is added to the database!");
		System.out.println("Press Enter to Continue!");
		scan.nextLine();
		
	}
	
	public void buyRecord() {
		
		// Jika arrayList masih kosong, print "NO DATA"
		if(record.isEmpty()) {
			System.out.println("NO DATA!");
			System.out.println("Press Enter to Continue!");
			scan.nextLine();
		}
		
		// Jika tidak, print semua isinya
		else {
			System.out.println("=============================================================");
			for(int i = 0; i < record.size(); i++) {
				System.out.println("No: " + (i+1));
				System.out.println("Title: " + record.get(i).getTitle());
				System.out.println("Artist: " + record.get(i).getArtist_name());
				System.out.println("Album: " + record.get(i).getAlbum_name());
				System.out.println("Genre: " + record.get(i).getGenre());
				System.out.println("Record Length: " + record.get(i).getRecord_length());
				System.out.println("Producer: " + record.get(i).getProducer_name());
				System.out.println("Label: " + record.get(i).getRecord_label());
				System.out.println("Year of Release: " + record.get(i).getYear_of_release());
				if(record.get(i) instanceof Indie) {
					System.out.println("Subgenre: " + ((Indie)record.get(i)).getIndie_subgenre());
				}
				else if(record.get(i) instanceof Pop) {
					System.out.println("Subgenre: " + ((Pop)record.get(i)).getPop_subgenre());
				}
				else if(record.get(i) instanceof Rock) {
					System.out.println("Subgenre: " + ((Rock)record.get(i)).getRock_subgenre());
				}
			}
			System.out.println("=============================================================");
			System.out.println("");
			
			int idx; // untuk menyimpan index dari rekaman yang ingin dibeli
			int price = 0; // untuk menyimpan harga dari rekaman
			
			// Input index rekaman yang ingin dibeli
			do {
				System.out.println("Input the index of the record you want to buy [1-" + record.size() + "]: "); 
				idx = scan.nextInt(); scan.nextLine();
			}while(idx < 1 || idx > record.size());
			
			// Print details dari rekaman yang hendak dibeli
			System.out.println("");
			System.out.println("");
			System.out.println("Record's Details: ");
			System.out.println("No: " + (idx));
			System.out.println("Title: " + record.get(idx-1).getTitle());
			System.out.println("Artist: " + record.get(idx-1).getArtist_name());
			System.out.println("Album: " + record.get(idx-1).getAlbum_name());
			System.out.println("Genre: " + record.get(idx-1).getGenre());
			System.out.println("Record Length: " + record.get(idx-1).getRecord_length());
			System.out.println("Producer: " + record.get(idx-1).getProducer_name());
			System.out.println("Label: " + record.get(idx-1).getRecord_label());
			System.out.println("Year of Release: " + record.get(idx-1).getYear_of_release());
			
			// Print subgenre indie, harga rekamannya, dan bonus yang didapatkan oleh pembeli
			if(record.get(idx-1) instanceof Indie) {
				System.out.println("Subgenre: " + ((Indie)record.get(idx-1)).getIndie_subgenre());
				System.out.println("");
				System.out.println("Price: " + ((Indie)record.get(idx-1)).pricing());
				price = ((Indie)record.get(idx-1)).pricing();
				((Indie)record.get(idx-1)).getBonus();
				System.out.println("");
			}
			
			// Print subgenre pop, harga rekamannya, dan bonus yang didapatkan oleh pembeli
			else if(record.get(idx-1) instanceof Pop) {
				System.out.println("Subgenre: " + ((Pop)record.get(idx-1)).getPop_subgenre());
				System.out.println("");
				System.out.println("Price: " + ((Pop)record.get(idx-1)).pricing());
				price = ((Pop)record.get(idx-1)).pricing();
				((Pop)record.get(idx-1)).getBonus();
				System.out.println("");
			}
			
			// Print subgenre rock, harga rekamannya, dan nominal voucher yang didapatkan oleh pembeli
			else if(record.get(idx-1) instanceof Rock) {
				System.out.println("Subgenre: " + ((Rock)record.get(idx-1)).getRock_subgenre());
				System.out.println("");
				System.out.println("Price: " + ((Rock)record.get(idx-1)).pricing());
				price = ((Rock)record.get(idx-1)).pricing();
				((Rock)record.get(idx-1)).generateVoucher();
				System.out.println("");
			}
			
			int payment = 0; // variabel untuk menyimpan nominal pembayaran pembeli
			
			do {
				System.out.println("Insert payment (minimal Rp" + price + "): ");
				payment = scan.nextInt(); scan.nextLine();
			}while(payment < price);
			
			record.remove(idx-1); // hapus rekaman dari arrayList
			
			// Jika pembayarannya lebih besar daripada harga rekaman, maka tampilkan berapa kembaliannya
			if(payment > price) {
				System.out.println("Here is your change: " + (payment - price));
				System.out.println("Thank You for Shopping at SIDELINES RECORD STORE! Come Back Soon!");
			}
			
			else {
				System.out.println("Thank You for Shopping at SIDELINES RECORD STORE! Come Back Soon!");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Main();

	}
}
