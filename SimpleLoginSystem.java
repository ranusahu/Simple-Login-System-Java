import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleLoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dummy credentials
        Map<String, String> users = new HashMap<>();
        users.put("admin", "1234");
        users.put("ranu", "pass123");
        users.put("user", "user@123");

        // Input from user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Login validation
        if (users.containsKey(username)) {
            if (users.get(username).equals(password)) {
                System.out.println(" Login Successful! Welcome " + username);
            } else {
                System.out.println(" Wrong password!");
            }
        } else {
            System.out.println(" Username not found!");
        }

        sc.close();
    }
}

