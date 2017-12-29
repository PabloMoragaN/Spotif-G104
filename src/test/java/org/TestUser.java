package org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;



import domain.Account;
import domain.Client;

public class TestUser {

	private Client cl1;
	
		@Before
		public void setUp() {
			//Simulate creation of a client
			String mail="gmailDotCom";
			String password="1234a";
			cl1 = new Client(mail,password);
			cl1.setEmail(mail);
			cl1.setPassword(password);
		}
	
		@Test
		public void testLogin1() {
			
			assertTrue(cl1.login("gmailDotCom","1234a"));//TRUE
		
		}
		
		@Test
		public void testLogin2() {
			assertFalse(cl1.login("bluewolf.com","w10"));//TRUE
		}
		
		@Test
		public void testLogin3() {
			assertTrue(cl1.login("gmailDotCom", "1234a"));//TRUE
		}
		
		@Test
		public void testLogin4() {
			assertFalse(cl1.login("gmai!DotC^m", "123*4-a"));//TRUE
		}
			
		
		
}
