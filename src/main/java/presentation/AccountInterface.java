package presentation;

import java.util.Scanner;

import domain.*;
import persistence.*;

public class AccountInterface {
	//Represents how the app would work
	public static void main(String[]args){
		CassandraDBBroker cdbb = new CassandraDBBroker();
		cdbb.simulateFunctionality();
	}
}
