package org.Iteration1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Domain.DaoAlbum;
import Domain.Song;
import Domain.Album;

/**
 * Unit test for simple App.
 */
public class TestDaoAlbum
{

    private Album album;
    private DaoAlbum dao;
    private Song [] listSongs;
    
    @Before
    public void setUp(){
    	album = new Album("306578981qwe","Despacito","Luis Fonsi ft. Dady Yankee",2.99,"12-01-2017",listSongs);
    	dao = new DaoAlbum();
    }
    
    @Test
    public void testAddAlbum(){
    	dao.addAlbum(album);
    	//variable which will contains in the database.
    	String idAlbum="0aab";
    	assertTrue(!(album.getIdAlbum().contentEquals(idAlbum)));
    }
    
}