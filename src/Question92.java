/* QUESTION 92: Write a Java program to demonstrate object oriented
programming.

1. Create a class Gym:
   • gymName (String)
   • membershipFee (double)

2. Create a class Member:
   • memberName (String)
   • memberId (int)
   • gym (Gym)
   • Method setGym(Gym gym)
   • Method displayDetails()

3. Main Class:
   • Create Gym object
   • Create Member object
   • Assign gym
   • Display details

Expected Output:
Member Name: Rakesh
Member ID: 880
Gym Name: FitLife Gym
Membership Fee: 1500.0
*/

class Gym {
    String gymName;
    double membershipFee;

    public Gym(String gymName, double membershipFee) {
        this.gymName = gymName;
        this.membershipFee = membershipFee;
    }
}

class Member {
    String memberName;
    int memberId;
    Gym gym;

    public Member(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Gym Name: " + gym.gymName);
        System.out.println("Membership Fee: " + gym.membershipFee);
    }
}

public class Question92 {
    public static void main(String[] args) {
        Gym g = new Gym("FitLife Gym", 1500.0);
        Member m = new Member("Rakesh", 880);
        m.setGym(g);
        m.displayDetails();
    }
}