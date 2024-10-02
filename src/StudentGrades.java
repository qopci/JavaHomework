/* Two Topics: Hash Maps, ArrayLists */
import java.util.ArrayList;
import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        // creating a HashMap to store student names and their grades
        HashMap<String, ArrayList<Integer>> studentGrades = new HashMap<>();

        // add students and their grades
        addGrade(studentGrades, "Alice", 85);
        addGrade(studentGrades, "Alice", 90);
        addGrade(studentGrades, "Bob", 78);
        addGrade(studentGrades, "Bob", 82);
        addGrade(studentGrades, "Charlie", 95);

        // print all students and their grades
        printGrades(studentGrades);
    }

    // add a grade for a student
    public static void addGrade(HashMap<String, ArrayList<Integer>> map, String student, int grade) {
        map.putIfAbsent(student, new ArrayList<>());
        map.get(student).add(grade);
    }

    // print all students and their grades
    public static void printGrades(HashMap<String, ArrayList<Integer>> map) {
        for (String student : map.keySet()) {
            System.out.println("Grades for " + student + ": " + map.get(student));
        }
    }
}