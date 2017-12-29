package domain;



public class Email {
	private String text;
	
	private Client source;
	
	private Client destination;
	
	
	public Email(String text,Client source,Client destination) {
		this.text=text;
		this.source=source;
		this.destination=destination;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public Client getSource() {
		return source;
	}


	public void setSource(Client source) {
		this.source = source;
	}


	public Client getDestination() {
		return destination;
	}


	public void setDestination(Client destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Email [text=" + text + ", source=" + source.getEmail() + ", destination=" + destination.getEmail() + "]";
	}

}
