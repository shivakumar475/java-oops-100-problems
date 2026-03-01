/* QUESTION 90: Write a Java program to demonstrate object oriented
programming.

1. Create a class Hospital:
   • hospitalName (String)
   • location (String)

2. Create a class Doctor:
   • doctorName (String)
   • specialization (String)
   • hospital (Hospital)
   • Method setHospital(Hospital hospital)
   • Method displayDetails()

3. Main Class:
   • Create Hospital object
   • Create Doctor object
   • Link using setHospital()
   • Display details

Expected Output:
Doctor Name: Dr. Shalini
Specialization: Cardiologist
Hospital: Apollo
Location: Hyderabad
*/

class Hospital {
    String hospitalName;
    String location;

    public Hospital(String hospitalName, String location) {
        this.hospitalName = hospitalName;
        this.location = location;
    }
}

class Doctor {
    String doctorName;
    String specialization;
    Hospital hospital;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void displayDetails() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
        System.out.println("Hospital: " + hospital.hospitalName);
        System.out.println("Location: " + hospital.location);
    }
}

public class Question90 {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo", "Hyderabad");
        Doctor d = new Doctor("Dr. Shalini", "Cardiologist");

        d.setHospital(h);
        d.displayDetails();
    }
}