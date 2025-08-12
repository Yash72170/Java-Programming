import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Student class to represent student data
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String address;
    private String course;
    private Map<String, Double> grades;
    private LocalDate enrollmentDate;
    
    public Student(String studentId, String firstName, String lastName, String email, 
                   String phoneNumber, LocalDate dateOfBirth, String address, String course) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.course = course;
        this.grades = new HashMap<>();
        this.enrollmentDate = LocalDate.now();
    }
    
    // Getters and setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getFullName() { return firstName + " " + lastName; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    
    public Map<String, Double> getGrades() { return grades; }
    public void setGrades(Map<String, Double> grades) { this.grades = grades; }
    
    public LocalDate getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(LocalDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }
    
    // Add grade for a subject
    public void addGrade(String subject, double grade) {
        grades.put(subject, grade);
    }
    
    // Calculate GPA
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        double sum = grades.values().stream().mapToDouble(Double::doubleValue).sum();
        return sum / grades.size();
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Course: %s | GPA: %.2f", 
                           studentId, getFullName(), course, calculateGPA());
    }
}

// Main Student Management System class
class StudentManagementSystem {
    private Map<String, Student> students;
    private Scanner scanner;
    private final String DATA_FILE = "students.dat";
    
    public StudentManagementSystem() {
        students = new HashMap<>();
        scanner = new Scanner(System.in);
        loadStudentsFromFile();
    }
    
    // Save students to file
    private void saveStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(students);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    
    // Load students from file
    @SuppressWarnings("unchecked")
    private void loadStudentsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            students = (Map<String, Student>) ois.readObject();
            System.out.println("Data loaded successfully. " + students.size() + " students found.");
        } catch (FileNotFoundException e) {
            System.out.println("No existing data file found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
    
    // Generate unique student ID
    private String generateStudentId() {
        return "STU" + String.format("%04d", students.size() + 1);
    }
    
    // Add new student
    public void addStudent() {
        System.out.println("\n=== Add New Student ===");
        
        try {
            System.out.print("First Name: ");
            String firstName = scanner.nextLine().trim();
            
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine().trim();
            
            System.out.print("Email: ");
            String email = scanner.nextLine().trim();
            
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine().trim();
            
            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dobStr = scanner.nextLine().trim();
            LocalDate dateOfBirth = LocalDate.parse(dobStr);
            
            System.out.print("Address: ");
            String address = scanner.nextLine().trim();
            
            System.out.print("Course: ");
            String course = scanner.nextLine().trim();
            
            String studentId = generateStudentId();
            Student student = new Student(studentId, firstName, lastName, email, 
                                        phoneNumber, dateOfBirth, address, course);
            
            students.put(studentId, student);
            saveStudentsToFile();
            
            System.out.println("Student added successfully! Student ID: " + studentId);
            
        } catch (Exception e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
    
    // View student details
    public void viewStudent() {
        System.out.println("\n=== View Student ===");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine().trim().toUpperCase();
        
        Student student = students.get(studentId);
        if (student != null) {
            displayStudentDetails(student);
        } else {
            System.out.println("Student not found!");
        }
    }
    
    // Display detailed student information
    private void displayStudentDetails(Student student) {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getFullName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Date of Birth: " + student.getDateOfBirth());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Enrollment Date: " + student.getEnrollmentDate());
        System.out.println("GPA: " + String.format("%.2f", student.calculateGPA()));
        
        System.out.println("\nGrades:");
        if (student.getGrades().isEmpty()) {
            System.out.println("No grades recorded.");
        } else {
            student.getGrades().forEach((subject, grade) -> 
                System.out.println("  " + subject + ": " + grade));
        }
    }
    
    // Update student information
    public void updateStudent() {
        System.out.println("\n=== Update Student ===");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine().trim().toUpperCase();
        
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        
        System.out.println("Current details:");
        displayStudentDetails(student);
        
        System.out.println("\nWhat would you like to update?");
        System.out.println("1. Email");
        System.out.println("2. Phone Number");
        System.out.println("3. Address");
        System.out.println("4. Course");
        System.out.print("Choose option (1-4): ");
        
        int choice = Integer.parseInt(scanner.nextLine().trim());
        
        switch (choice) {
            case 1:
                System.out.print("New Email: ");
                student.setEmail(scanner.nextLine().trim());
                break;
            case 2:
                System.out.print("New Phone Number: ");
                student.setPhoneNumber(scanner.nextLine().trim());
                break;
            case 3:
                System.out.print("New Address: ");
                student.setAddress(scanner.nextLine().trim());
                break;
            case 4:
                System.out.print("New Course: ");
                student.setCourse(scanner.nextLine().trim());
                break;
            default:
                System.out.println("Invalid option!");
                return;
        }
        
        saveStudentsToFile();
        System.out.println("Student information updated successfully!");
    }
    
    // Delete student
    public void deleteStudent() {
        System.out.println("\n=== Delete Student ===");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine().trim().toUpperCase();
        
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        
        System.out.println("Student to delete:");
        displayStudentDetails(student);
        
        System.out.print("Are you sure you want to delete this student? (y/N): ");
        String confirm = scanner.nextLine().trim().toLowerCase();
        
        if (confirm.equals("y") || confirm.equals("yes")) {
            students.remove(studentId);
            saveStudentsToFile();
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Deletion cancelled.");
        }
    }
    
    // Add grades for a student
    public void addGrades() {
        System.out.println("\n=== Add Grades ===");
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine().trim().toUpperCase();
        
        Student student = students.get(studentId);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        
        System.out.println("Adding grades for: " + student.getFullName());
        
        while (true) {
            System.out.print("Subject name (or 'done' to finish): ");
            String subject = scanner.nextLine().trim();
            
            if (subject.toLowerCase().equals("done")) {
                break;
            }
            
            System.out.print("Grade (0-100): ");
            try {
                double grade = Double.parseDouble(scanner.nextLine().trim());
                
                if (grade >= 0 && grade <= 100) {
                    student.addGrade(subject, grade);
                    System.out.println("Grade added successfully!");
                } else {
                    System.out.println("Grade must be between 0 and 100!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade format!");
            }
        }
        
        saveStudentsToFile();
        System.out.println("All grades saved successfully!");
    }
    
    // List all students
    public void listAllStudents() {
        System.out.println("\n=== All Students ===");
        
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        
        students.values().stream()
                .sorted((s1, s2) -> s1.getLastName().compareToIgnoreCase(s2.getLastName()))
                .forEach(System.out::println);
        
        System.out.println("\nTotal students: " + students.size());
    }
    
    // Search students by name or course
    public void searchStudents() {
        System.out.println("\n=== Search Students ===");
        System.out.print("Enter search term (name or course): ");
        String searchTerm = scanner.nextLine().trim().toLowerCase();
        
        List<Student> results = students.values().stream()
                .filter(s -> s.getFullName().toLowerCase().contains(searchTerm) ||
                           s.getCourse().toLowerCase().contains(searchTerm))
                .sorted((s1, s2) -> s1.getLastName().compareToIgnoreCase(s2.getLastName()))
                .toList();
        
        if (results.isEmpty()) {
            System.out.println("No students found matching: " + searchTerm);
        } else {
            System.out.println("Found " + results.size() + " student(s):");
            results.forEach(System.out::println);
        }
    }
    
    // Generate reports
    public void generateReports() {
        System.out.println("\n=== Reports ===");
        System.out.println("1. Students by Course");
        System.out.println("2. Top Performers (GPA > 3.5)");
        System.out.println("3. Students needing attention (GPA < 2.0)");
        System.out.print("Choose report (1-3): ");
        
        int choice = Integer.parseInt(scanner.nextLine().trim());
        
        switch (choice) {
            case 1:
                generateCourseReport();
                break;
            case 2:
                generateTopPerformersReport();
                break;
            case 3:
                generateLowPerformersReport();
                break;
            default:
                System.out.println("Invalid option!");
        }
    }
    
    private void generateCourseReport() {
        System.out.println("\n--- Students by Course ---");
        Map<String, List<Student>> byCourse = new HashMap<>();
        
        students.values().forEach(student -> 
            byCourse.computeIfAbsent(student.getCourse(), k -> new ArrayList<>()).add(student));
        
        byCourse.forEach((course, studentList) -> {
            System.out.println("\n" + course + " (" + studentList.size() + " students):");
            studentList.forEach(s -> System.out.println("  " + s));
        });
    }
    
    private void generateTopPerformersReport() {
        System.out.println("\n--- Top Performers (GPA > 3.5) ---");
        students.values().stream()
                .filter(s -> s.calculateGPA() > 3.5)
                .sorted((s1, s2) -> Double.compare(s2.calculateGPA(), s1.calculateGPA()))
                .forEach(System.out::println);
    }
    
    private void generateLowPerformersReport() {
        System.out.println("\n--- Students Needing Attention (GPA < 2.0) ---");
        students.values().stream()
                .filter(s -> s.calculateGPA() > 0 && s.calculateGPA() < 2.0)
                .sorted((s1, s2) -> Double.compare(s1.calculateGPA(), s2.calculateGPA()))
                .forEach(System.out::println);
    }
    
    // Main menu
    public void showMenu() {
        System.out.println("\n=== Student Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Add Grades");
        System.out.println("6. List All Students");
        System.out.println("7. Search Students");
        System.out.println("8. Generate Reports");
        System.out.println("9. Exit");
        System.out.print("Choose an option (1-9): ");
    }
    
    // Run the application
    public void run() {
        System.out.println("Welcome to Student Management System!");
        
        while (true) {
            try {
                showMenu();
                int choice = Integer.parseInt(scanner.nextLine().trim());
                
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewStudent();
                        break;
                    case 3:
                        updateStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        addGrades();
                        break;
                    case 6:
                        listAllStudents();
                        break;
                    case 7:
                        searchStudents();
                        break;
                    case 8:
                        generateReports();
                        break;
                    case 9:
                        System.out.println("Thank you for using Student Management System!");
                        saveStudentsToFile();
                        return;
                    default:
                        System.out.println("Invalid option! Please choose 1-9.");
                }
                
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
                
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}

// Main class to run the application
public class StudentManagementApp {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.run();
    }
}