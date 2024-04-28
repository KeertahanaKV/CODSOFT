import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    int numSubjects;
    int[] marks;
    int totalMarks;
    double averagePercentage;
    char grade;

    Student() {
        System.out.println("Enter The Number of Subjects:");
        numSubjects = sc.nextInt();
        marks = new int[numSubjects]; // Initializing marks array with numSubjects
    }

    void Marks() {
        // Input marks obtained in each subject
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void totalMarks() {
        // Calculate total marks
        totalMarks = 0;
        for (int mark : marks)
            totalMarks += mark;
    }

    void average_percent() {
        // Calculate average percentage
        averagePercentage = (double) totalMarks / numSubjects;
    }

    void grade() {
        // Grade calculation
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    void display() {
        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Student s = new Student();
        s.Marks();
        s.totalMarks();
        s.average_percent();
        s.grade();
        s.display();
    }
}
