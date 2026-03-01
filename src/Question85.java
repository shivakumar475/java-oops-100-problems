/* QUESTION 85: Write a Java program to demonstrate object oriented
programming.

1. Create a class Passport:
   • passportNumber (String)
   • nationality (String)

2. Create a class Citizen:
   • citizenName (String)
   • age (int)
   • passport (Passport)
   • Method setPassport(Passport passport)
   • Method displayDetails()

3. Main Class:
   • Create Passport object
   • Create Citizen object
   • Link passport
   • Display details

Expected Output:
Citizen Name: Rohan
Age: 30
Passport Number: A1234567
Nationality: Indian
*/

class Passport {
    String passportNumber;
    String nationality;

    public Passport(String passportNumber, String nationality) {
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
}

class Citizen {
    String citizenName;
    int age;
    Passport passport;

    public Citizen(String citizenName, int age) {
        this.citizenName = citizenName;
        this.age = age;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void displayDetails() {
        System.out.println("Citizen Name: " + citizenName);
        System.out.println("Age: " + age);
        System.out.println("Passport Number: " + passport.passportNumber);
        System.out.println("Nationality: " + passport.nationality);
    }
}

public class Question85 {
    public static void main(String[] args) {
        Passport p = new Passport("A1234567", "Indian");
        Citizen c = new Citizen("Rohan", 30);
        c.setPassport(p);
        c.displayDetails();
    }
}