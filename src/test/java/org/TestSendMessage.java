package org;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import domain.Client;
import domain.Email;
import domain.Server;


public class TestSendMessage {
	private Server ser;
	private Client cl1;
	private Client cl2;
	private Email em;
	
	@Before
	public void setUp() {
		cl1= new Client("pedro@gmail","psw1");
		cl2= new Client("paco@gmail","psw2");
		em = new Email("Hello Paco",cl1,cl2);
		
		ser = new Server();
		
	}
	
	
	@Test
	public void testSendMsg1() {
		assertTrue(ser.sendMessage(cl1, cl2, em));
	}
	@Test
	public void testSendMsg2() {
		assertFalse(ser.sendMessage(null, cl2, em));
	}
	@Test
	public void testSendMsg3() {
		assertFalse(ser.sendMessage(cl1, null, em));
	}
	@Test
	public void testSendMsg4() {
		assertFalse(ser.sendMessage(cl1, cl2, null));
	}
	
	
}
