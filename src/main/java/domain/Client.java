package domain;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String email;
	private String password;
	private boolean premium;
	private String creditCardNum;
	private String payPalAcc;
	private Account spotifAccount;
	private List<Email> receivedEmails = new ArrayList<Email>();

	public Client(final String mail, final String pswd){
		this.email=mail;
		this.password=password;
	}
	
	public Client(final String mail, final String pswd,ArrayList<Email>receivedEmails){
		this.email=mail;
		this.password=password;
		this.receivedEmails=receivedEmails;
	}

	public boolean isPremium(){
		return premium;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCardNum() {
		return creditCardNum;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public List<Email> getReceivedEmails() {
		return receivedEmails;
	}

	public void setReceivedEmails(List<Email> receivedEmails) {
		this.receivedEmails = receivedEmails;
	}

	//TestLogin
	public boolean login(String mail, String psw){
		boolean bool=true;
		if(mail.equals(this.email) && psw.equals(this.password) && isAlphanumeric(mail) && isAlphanumeric(psw)){
			bool= true;
		}else {
		bool= false;
		}
		return bool;
	}
	
	public  boolean isAlphanumeric(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}


	
	
	//TEST
		
}
