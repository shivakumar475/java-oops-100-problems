/* QUESTION 80: Write a Java program to demonstrate object oriented
programming.

1. Address Class
   • street (String)
   • city (String)
   • zipCode (int)
   • Method displayAddress()

2. Student Class
   • studentName (String)
   • studentId (int)
   • address (Address)
   • Method setAddress(Address address)
   • Method displayStudentDetails()

3. Main Class:
   • Create Address object
   • Create Student object
   • Link using setAddress()
   • Display details

Expected Output:
Student Name: Riya
Student ID: 101
Street: MG Road
City: Bangalore
Zip Code: 560001
*/

class Address {
    String street;
    String city;
    int zipCode;

    public Address(String street, String city, int zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}

class Student {
    String studentName;
    int studentId;
    Address address;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        address.displayAddress();
    }
}

public class Question80 {
    public static void main(String[] args) {
        Address addr = new Address("MG Road", "Bangalore", 560001);
        Student s = new Student("Riya", 101);
        s.setAddress(addr);
        s.displayStudentDetails();
    }
}