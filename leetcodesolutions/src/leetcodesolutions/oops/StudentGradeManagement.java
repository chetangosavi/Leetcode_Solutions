package leetcodesolutions.oops;
import java.util.ArrayList;
import java.util.Scanner;


class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

public class StudentGradeManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Calculate Average Grade");
            System.out.println("4. Display Highest and Lowest Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    calculateAverageGrade();
                    break;
                case 4:
                    displayHighestLowestGrade();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        int grade;
        while (true) {
            System.out.print("Enter student grade: ");
            try {
                grade = Integer.parseInt(scanner.nextLine());
                if (grade < 0 || grade > 100) {
                    System.out.println("Grade must be between 0 and 100.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric grade.");
            }
        }

        students.add(new Student(name, grade));
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
    }

    private static void calculateAverageGrade() {
        if (students.isEmpty()) {
            System.out.println("No students available to calculate average grade.");
            return;
        }
        int sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        double average = (double) sum / students.size();
        System.out.printf("Average Grade: %.2f\n", average);
    }

    private static void displayHighestLowestGrade() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (Student student : students) {
            if (student.getGrade() > highest) {
                highest = student.getGrade();
            }
            if (student.getGrade() < lowest) {
                lowest = student.getGrade();
            }
        }
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}

