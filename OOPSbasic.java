class Student {
    String name;
    int age;
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class OOPSbasic {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student1 = new Student("Mahi", 18, "A");
        
        // Display student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        student1.name = "Mahi Bhardwaj";
        System.out.println("\nUpdated Student 1 Details:");
        student1.displayDetails();

        // Creating another student object
        Student student2 = new Student("Arya", 20, "B");
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }
}