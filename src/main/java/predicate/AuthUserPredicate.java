package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthUserPredicate {

    static class User {
        String username;
        String password;

        User(String username, String password) {
            this.password = password;
            this.username = username;
        }
    }

    public static void main(String[] args) {
        Predicate<User> userPredicate = user-> user.username.equals("admin")
                && user.password.equals("admin");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();

        User user = new User(username, password);
        if(userPredicate.test(user)) {
            System.out.println("Valid user");
        } else {
            System.out.println("Invalid user");
        }
    }
}
