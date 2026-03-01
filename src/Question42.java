/*QUESTION 42: Write a Java program to demonstrate object oriented
programming.
1. Create a class LibraryMember with private data members:
 o memberId (int)
 o memberName (String)
 o booksIssued (int)
2. Provide public methods:
 o setMemberDetails(int memberId, String memberName, int booksIssued)
 ▪ Maximum books allowed = 5
 o getMemberId()
 o getMemberName()
 o getBooksIssued()
 o getMembershipStatus() →
 ▪ Returns "Active" if booksIssued ≤ 5
 ▪ Else "Limit Exceeded"
3. Create a Main class.
In the main() method:
 o Create an object of LibraryMember
 o Set member details
 o Display member information and status
Expected Output:
Member ID: 501
Member Name: Anjali
Books Issued: 3
Membership Status: Active */


class LibraryMember {
    private int memberId;
    private String memberName;
    private int booksIssued;

    public void setMemberDetails(int memberId, String memberName, int booksIssued) {
        this.memberId = memberId;
        this.memberName = memberName;

        if (booksIssued <= 5) {
            this.booksIssued = booksIssued;
        } else {
            this.booksIssued = booksIssued;
            System.out.println("Warning: Book limit exceeded");
        }
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public String getMembershipStatus() {
        if (booksIssued <= 5) {
            return "Active";
        } else {
            return "Limit Exceeded";
        }
    }
}

public class Question42 {
    public static void main(String[] args) {
        LibraryMember lm = new LibraryMember();

        lm.setMemberDetails(501, "Anjali", 3);

        System.out.println("Member ID: " + lm.getMemberId());
        System.out.println("Member Name: " + lm.getMemberName());
        System.out.println("Books Issued: " + lm.getBooksIssued());
        System.out.println("Membership Status: " + lm.getMembershipStatus());
    }
}