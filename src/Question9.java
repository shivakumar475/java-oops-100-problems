/*QUESTION 9: Write a Java program to demonstrate object oriented 
programming. 
Create a class University with data members: 
  o universityName (String) 
  o location (String) 
1. In University class, create the following methods: 
  o setUniversityDetails(String universityName, String location) 
  o displayUniversityDetails() 
2. Create a class Department that inherits University with data member: 
  o departmentName (String) 
3. In Department class, create the following methods: 
  o setDepartmentDetails(String departmentName) 
  o displayDepartmentDetails() 
4. Create a class Course that inherits Department with data members: 
  o courseName (String) 
  o duration (int) 
5. In Course class, create the following methods: 
  o setCourseDetails(String courseName, int duration) 
  o displayCourseDetails() 
6. Create a Main class. 
In the main() method: 
  o Create an object of Course 
  o Call the following methods in order: 
    setUniversityDetails() 
    setDepartmentDetails() 
    setCourseDetails() 
    displayCourseDetails() 
Expected Output: 
University Name: ABC University 
Location: Hyderabad 
Department: Computer Science 
Course Name: Data Structures 
Duration: 6 Months*/



class University {
    String universityName;
    String location;
    
    public void setUniversityDetails(String universityName, String location) {
        this.universityName=universityName;
        this.location=location;
    }
    public void  displayUniversityDetails() {
        System.out.println("University Name: "+universityName);
        System.out.println("Location: "+location);
    }
}

class Department extends University {
    String departmentName;
    
    public void setDepartmentDetails(String departmentName)  {
        this.departmentName=departmentName;
    }
    
    public void displayDepartmentDetails() {
        displayUniversityDetails();
        System.out.println("Department: "+departmentName);
    }
}

class Course extends Department {
    String courseName;
    int duration;
    
    public void setCourseDetails(String courseName, int duration) {
        this.courseName=courseName;
        this.duration=duration;
    }
    public void displayCourseDetails() {
        displayDepartmentDetails();
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" Months");
    }
}

public class Question9 {
    public static void main(String[] args) {
        Course c = new Course();
        c.setUniversityDetails("ABC University", "Hyderabad");
        c.setDepartmentDetails("Computer Science");
        c.setCourseDetails("Data Structures", 6);
        c.displayCourseDetails();
    }
}