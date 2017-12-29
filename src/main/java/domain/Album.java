package domain;
import java.util.ArrayList;

public class Album {

	protected String name, artist;
	protected ArrayList<Song>track_list=new ArrayList<Song>();

	public Album(String name, String artist, ArrayList<Song>track_list){
		this.name=name;
		this.artist=artist;
		this.track_list=track_list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Song> getTrack_list() {
		return track_list;
	}

	public void setTrack_list(ArrayList<Song> track_list) {
		this.track_list = track_list;
	}
	
	//for testing
	public boolean hasSong(Song s){
		boolean check=false;
		boolean bool = true;
		for(int i=0;i<track_list.size() && bool==true;i++){
			if(s!=null && s.getName()!=null && s.getDuration()>0) {
				if(track_list.get(i).getName().equals(s.getName()) && track_list.get(i).getDuration()==s.getDuration() ){
					check=true;
					bool=false;
				}else{
					check=false;
				}
			}
		}
		return check;
	}

}
