class Student {
    String name;
    double marks;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.marks = 0;
    }

    // Overloaded Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks > 90) {
            return 'S';
        } else if (marks > 80) {
            return 'A';
        } else if (marks > 70) {
            return 'B';
        } else if (marks > 60) {
            return 'C';
        } else if (marks > 50) {
            return 'D';
        } else if (marks > 40) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Method to display result
    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + calculateGrade());
    }
}

// Main class to test
public class DemoStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun", 80);
        s1.display();

        System.out.println();

        Student s2 = new Student();

        s2.display();
    }
}
