package domain;

public class Email {

    private String text;
    private Client source;
    private Client destination;

    public Email(String text, Client source, Client destination) {
        this.text = text;
        this.source = source;
        this.destination = destination;
    }

    final public String getText() {
        return text;
    }


    final public void setText(String text) {
        this.text = text;
    }


    final public Client getSource() {
        return source;
    }


    final public void setSource(Client source) {
        this.source = source;
    }


    final public Client getDestination() {
        return destination;
    }


    final public void setDestination(Client destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Email [text=" + text + ", source=" + source.getEmail() + ", destination=" + destination.getEmail() + "]";
    }
}
