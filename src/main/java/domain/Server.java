package domain;

import java.util.ArrayList;
import java.util.List;

public class Server {

	public Server() {
		
	}

	public boolean sendMessage(Client cl1,Client cl2,Email em){

		if (cl1 != null && cl2 != null && em != null) {
			List<Email> emails = new ArrayList<Email>();
			 emails =cl2.getReceivedEmails();
	
			emails.add(emails.size(), em);
			cl2.setReceivedEmails(emails);
			return true;
		}

		return false;

	}
	
	
}
