/* QUESTION 74: Write a Java program to demonstrate object oriented
programming.

1. Create an interface InternalAssessment with the method:
   o calculateInternalMarks()

2. Create an interface ExternalAssessment with the method:
   o calculateExternalMarks()

3. Create a class FinalResult that implements InternalAssessment, ExternalAssessment.

4. In the FinalResult class:
   o Create data members:
       ▪ internalMarks (int)
       ▪ externalMarks (int)
   o Implement both interface methods
   o Calculate and display total marks and result status (Pass if total ≥ 40)

5. Create a Main class.
   In the main() method:
   o Create an object of FinalResult
   o Call both interface methods

Expected Output:
Internal Marks: 18
External Marks: 30
Total Marks: 48
Result: Pass
*/

interface InternalAssessment {
    void calculateInternalMarks();
}

interface ExternalAssessment {
    void calculateExternalMarks();
}

class FinalResult implements InternalAssessment, ExternalAssessment {
    int internalMarks;
    int externalMarks;

    @Override
    public void calculateInternalMarks() {
        internalMarks = 18;
        System.out.println("Internal Marks: " + internalMarks);
    }

    @Override
    public void calculateExternalMarks() {
        externalMarks = 30;
        System.out.println("External Marks: " + externalMarks);
    }

    public void displayResult() {
        int total = internalMarks + externalMarks;
        System.out.println("Total Marks: " + total);
        System.out.println("Result: " + (total >= 40 ? "Pass" : "Fail"));
    }
}

public class Question74 {
    public static void main(String[] args) {
        FinalResult fr = new FinalResult();
        fr.calculateInternalMarks();
        fr.calculateExternalMarks();
        fr.displayResult();
    }
}