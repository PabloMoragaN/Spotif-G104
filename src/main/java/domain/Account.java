package domain;
import java.util.ArrayList;

public class Account {
	
	protected Client cl;
	protected ArrayList<Song> bought_songs;
	protected ArrayList<Album> bought_albums;
	
	public Account(Client cl){
		this.cl=cl;
	}

	public ArrayList<Song> getBought_songs() {
		return bought_songs;
	}

	public void setBought_songs(ArrayList<Song> bought_songs) {
		this.bought_songs = bought_songs;
	}

	public ArrayList<Album> getBought_albums() {
		return bought_albums;
	}

	public void setBought_albums(ArrayList<Album> bought_albums) {
		this.bought_albums = bought_albums;
	}
	
	//for testing
	public boolean playSong(Song s){
		if(s!=null && s.getName()!=null && s.getDuration()>0 && s.getDuration()<Long.MAX_VALUE && this.bought_songs.contains(s)){
			return true; //user has bought the song
		}else if(albumHasSong(s) && s!=null && s.getName()!=null && s.getDuration()>0 && s.getDuration()<Long.MAX_VALUE ){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean albumHasSong(Song s){
		int i;
		boolean check=false;
		boolean bool=true;
		if(s!=null && s.getName()!=null && s.getDuration()>0 && s.getDuration()<Long.MAX_VALUE) {
			for(i=0;i<this.bought_albums.size() && bool==true;i++){
				if(this.bought_albums.get(i).hasSong(s)){
					check= true;
					bool=false;
				}
			}
		}
		return check;
	
	}
}
