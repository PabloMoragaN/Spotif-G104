package persistence;

import domain.*;
import java.util.ArrayList;


public class CassandraDBBroker {
 private ArrayList<Account> accounts_conected = new ArrayList<Account>();

 public CassandraDBBroker() { }

 public void simulateFunctionality() {
	 //Simulate creation of a client
	 String mail = "gmailDotCom";
	 String password = "1234a";
	 Client cl1 = new Client(mail, password);
	 //Account for the client
	 Account ac1 = new Account(cl1);
	 //Connect the account to the DB
	 this.accounts_conected.add(ac1);
	 ///////song and album//////
	 Song s1 = new Song("Despacito", 1000);
	 Song s2 = new Song("New rules", 2000);
	 Song s3 = new Song("Si te vas", 1200);
	 ArrayList<Song> lista = new ArrayList<Song>();
	 lista.add(s2);
	 lista.add(s3);
	 Album album1 = new Album("TestAlbum", "Los Chichos", lista);

	 //////menu/////
	 boolean menu = false;
	 int option = 0;
	 do {
		 System.out.println("1- Play song");
		 System.out.println("2- Buy song");
		 System.out.println("3- Buy Album");
		 System.out.println("4- Exit Spotif*");

		 switch (option) {
		 case 1:
			 System.out.println("Play s1,s2, or s3?");
			 //Suppose s1 which he has bought
			 System.out.println("" + ac1.playSong(s1));
			 break;
		 case 2:
			 System.out.println("Buy s1,s2, or s3");
			 //Lets say he buys s1 only
			 ArrayList<Song> bought = new ArrayList<Song>();
			 bought.add(s1);
			 ac1.setBought_songs(bought);
			 break;
		 case 3:
			 //We only have 1 album so he buys this one
			 System.out.println("Buy " + album1.getName() + " ?");
			 //Supose yes
			 ArrayList<Album> boughtAlb = new ArrayList<Album>();
			 boughtAlb.add(album1);
			 ac1.setBought_albums(boughtAlb);
			 break;
		 case 4:
			 menu = true;
			 break;
		 default:
			 System.out.println("Choose one option please");
			 break;
		 }
	 } while (!menu);
 }
 
}
