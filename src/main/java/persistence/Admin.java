package persistence;

public class Admin {
    private String admin_name, password;

    public Admin(String admin_name, String password) {
        this.admin_name = admin_name;
        this.password = password;
    }

	@Override
	public String toString() {
		return "Admin [admin_name=" + admin_name + ", password=" + password + "]";
	}
}
