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