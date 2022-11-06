import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> usernamePassowrd = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Menu > ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				String u = signUpUsername();
				String p = signUpPassword();
				usernamePassowrd.put(u, p);
			}
			else if (choice == 2) {
				String user = logInUsername();
				String pass = logInPassword();
				String passwordCheck = usernamePassowrd.get(user);
				if (user == null) {
					System.out.println("account does not exist");
				}
				else if (user == passwordCheck) {
					System.out.println("logged in as " + user);
				}
				else {
					System.out.println("fail");
				}
			}
		}
	}
	
	public static String signUpUsername() {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Username > ");
		String username = s1.nextLine();
		return username;
	}
	public static String signUpPassword() {
		Scanner s2 = new Scanner(System.in);
		System.out.print("Password > ");
		String password = s2.nextLine();
		return password;
	}
	
	public static String logInUsername() {
		Scanner s3 = new Scanner(System.in);
		System.out.print("Username > ");
		String username = s3.nextLine();
		return username;
	}
	public static String logInPassword() {
		Scanner s4 = new Scanner(System.in);
		System.out.print("Password > ");
		String password = s4.nextLine();
		return password;
	}
}
