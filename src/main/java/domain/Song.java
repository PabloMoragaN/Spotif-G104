package domain;

public class Song {
	
	protected String name;
	protected long duration; //seconds
	
	public Song(String name,long duration){
		this.name=name;
		this.duration=duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	
}
