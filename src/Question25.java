/*QUESTION 25: Write a Java program to demonstrate object oriented
programming.
1. Create a class LoginSystem.
2. In LoginSystem class, create overloaded methods named login():
 o login(String username, String password)
 → returns "Login Successful" if password is "admin"
 → else returns "Invalid Password"
 o login(String email, int otp)
 → returns "OTP Verified" if otp is 1234
 → else returns "Invalid OTP"
3. Create a Main class.
In the main() method:
 o Create an object of LoginSystem
 o Call both login() methods
 o Display returned messages
Expected Output:
Login Successful
OTP Verified */

class LoginSystem {

    String login(String username, String password) {
        if (password.equals("admin")) {
            return "Login Successful";
        } else {
            return "Invalid Password";
        }
    }

    String login(String email, int otp) {
        if (otp == 1234) {
            return "OTP Verified";
        } else {
            return "Invalid OTP";
        }
    }
}

public class Question25 {
    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();

        String msg1 = ls.login("Shiva", "admin");
        String msg2 = ls.login("abc@gmail.com", 1234);

        System.out.println(msg1);
        System.out.println(msg2);
    }
}