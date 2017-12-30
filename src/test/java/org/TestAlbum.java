package org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


import domain.Song;
import domain.Album;


public class TestAlbum {

	private Album alb;
	
	@Before
	public void setUp() {
		ArrayList<Song>track_list=new ArrayList<Song>();
		Song song1= new Song("Vertigo",314);
		Song song2 = new Song("September",220);
		
		track_list.add(song1);
		track_list.add(song2);
		alb=new Album("Amor por Maven","Chichos",track_list);
	}
	
	@Test
	public void albumTest1() {
		
		assertFalse(alb.hasSong(new Song(null,215)));
	}
	@Test
	public void albumTest2() {
		
		assertFalse(alb.hasSong(new Song("HUMBLE.",-145)));
	}
	
	@Test
	public void albumTest3() {
		assertFalse(alb.hasSong(null));
	}
	@Test
	public void albumTest4() {
		Song song= new Song("Vertigo",314);
		assertTrue(alb.hasSong(song));
	}
	
	@Test
	public void albumTest5() {
		Song song= new Song("September",220);
		assertTrue(alb.hasSong(song));
	}
	
	
	
}
