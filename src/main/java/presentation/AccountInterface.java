package presentation;

import persistence.CassandraDBBroker;

public class AccountInterface {
    //Represents how the app would work
    public static void main(String[] args) {
        CassandraDBBroker cdbb = new CassandraDBBroker();
        cdbb.simulateFunctionality();
    }
}
