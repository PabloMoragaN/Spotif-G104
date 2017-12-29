package org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



import domain.Account;
import domain.Client;
import domain.Song;
import domain.Album;

public class TestPlaySong {
	
	private Song song1, song2;
	private Client cl1;
	private Account ac1;
	private Album al1;
	
	@Before
	public void setUp() {

		song1 = new Song("The Tempest", 180);
		song2 = new Song("Criminal", 240);
		
		
		//Client
		String mail="gmailDotCom";
		String password="1234a";
		cl1 = new Client(mail,password);	
		
		//Account
		ac1 = new Account(cl1);
		ArrayList <Song> list = new ArrayList<Song>();
		list.add(song1);
		list.add(song2);
		ac1.setBought_songs(list);
		
		//Album
		String albumName = "Discovery";
		String artist = "DaftPunk";
		al1 = new Album(albumName, artist, list);
				
		ArrayList<Album> listAlbum = new ArrayList<Album>();
		listAlbum.add(al1);
		ac1.setBought_albums(listAlbum);
		
		
	}
	@Test
	public void testPlay1() {
		assertFalse(ac1.playSong(null));
	}
	@Test
	public void testPlay2() {
		assertFalse(ac1.playSong(new Song("HUMBLE.",-415)));
	}
	@Test
	public void testPlay3() {
		assertFalse(ac1.playSong(new Song("Elevation.",Long.MAX_VALUE)));
	}
	@Test //Plays Song if bought
	public void testPlay4() {
		Song song = new Song("Criminal",240);
		assertTrue(ac1.playSong(song));
	}
	@Test	//Plays Song if bought
	public void testPlay5() {
		Song song = new Song("Odd Look",249);
		assertFalse(ac1.playSong(song));
	}
	
	@Test	//Checks if album bought has song
	public void testAlbumHasSong6() {
		Song song = new Song("The Tempest",180);
		assertTrue(ac1.albumHasSong(song));
	}
	
	@Test	//Checks if album bought has song
	public void testAlbumHasSong7() {
		Song song = new Song("Dreams",2660);
		assertFalse(ac1.albumHasSong(song));
	}
	@Test
	public void testAlbumHasSong8() {
		assertFalse(ac1.albumHasSong(null));
	}

}
