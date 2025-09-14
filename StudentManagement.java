import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // 1. Add students
        students.add(new Student("S001", "Alice", 8.5));
        students.add(new Student("S002", "Bob", 7.2));
        students.add(new Student("S003", "Charlie", 9.1));

        // 2. Display all students
        System.out.println("=== Student List ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // 3. Search by ID
        String searchId = "S002";
        System.out.println("\nSearching for student with ID: " + searchId);
        for (Student s : students) {
            if (s.getId().equals(searchId)) {
                System.out.println("Found: " + s);
            }
        }

        // 4. Remove student
        String removeId = "S001";
        students.removeIf(s -> s.getId().equals(removeId));
        System.out.println("\nAfter removing ID " + removeId + ":");
        for (Student s : students) {
            System.out.println(s);
        }

        // 5. Sort by grade (descending)
        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        System.out.println("\nSorted by grade (descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
