/*QUESTION 34: Write a Java program to demonstrate object oriented
programming.
1. Create a class UserAccount with private data members:
 o username (String)
 o password (String)
2. Provide public setter and getter methods:
 o setUsername(String username)
 o setPassword(String password)
 ▪ Password must be at least 6 characters long
 o getUsername()
 o getPassword()
3. Create a Main class.
In the main() method:
 o Create an object of UserAccount
 o Set username and password using setters
 o Display username and password using getters
Expected Output:
Username: adminUser
Password set successfully */

class UserAccount {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Password must be at least 6 characters long");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class Question34 {
    public static void main(String[] args) {
        UserAccount ua = new UserAccount();

        ua.setUsername("adminUser");
        ua.setPassword("admin12");

        System.out.println("Username: " + ua.getUsername());
    }
}