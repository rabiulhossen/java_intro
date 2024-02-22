import java.util.Scanner;

public class StudentManagementSystem {
    private static int totalStudents = 0;
    private static final int MAX_STUDENTS = 100;
    private static Student[] studentList = new Student[MAX_STUDENTS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Record Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. View Student Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    updateStudentInformation(scanner);
                    break;
                case 3:
                    viewStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the Student Record Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }


    private static void addNewStudent(Scanner scanner) {
        if (totalStudents < MAX_STUDENTS) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            System.out.print("Enter student grade: ");
            double grade = scanner.nextDouble();

            Student newStudent = new Student(id, name, age, grade);
            studentList[totalStudents++] = newStudent;

            System.out.println("Student added successfully!");
        } else {
            System.out.println("Maximum student limit reached. Cannot add more students.");
        }
    }

    private static void updateStudentInformation(Scanner scanner) {
        System.out.print("Enter student ID to update information: ");
        int idToUpdate = scanner.nextInt();

        int index = findStudentIndexById(idToUpdate);

        if (index != -1) {
            System.out.print("Enter new age for the student: ");
            int newAge = scanner.nextInt();
            System.out.print("Enter new grade for the student: ");
            double newGrade = scanner.nextDouble();

            studentList[index].setAge(newAge);
            studentList[index].setGrade(newGrade);

            System.out.println("Student information updated successfully!");
        } else {
            System.out.println("Student not found with ID: " + idToUpdate);
        }
    }

    private static void viewStudentDetails(Scanner scanner) {
        System.out.print("Enter student ID to view details: ");
        int idToView = scanner.nextInt();

        int index = findStudentIndexById(idToView);

        if (index != -1) {
            Student student = studentList[index];
            System.out.println("Student Details:");
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
        } else {
            System.out.println("Student not found with ID: " + idToView);
        }
    }

    private static int findStudentIndexById(int id) {
        for (int i = 0; i < totalStudents; i++) {
            if (studentList[i].getId() == id) {
                return i;
            }
        }
        return -1; // Student not found
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
