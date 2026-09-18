import java.util.*;

public class StudentRegistration {

    public static boolean registerStudent(Set<Integer> ids, int id) {
        // Write your code
        if(ids.contains(id))
            return false;
        
        ids.add(id);
        return true;
    }

    public static boolean isRegistered(Set<Integer> ids, int id) {
        // Write your code
        return ids.contains(id);
    }

    public static int totalStudents(Set<Integer> ids) {
        // Write your code
        return ids.size();
    }

    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>();

        System.out.println(registerStudent(ids, 101));
        System.out.println(registerStudent(ids, 102));
        System.out.println(registerStudent(ids, 103));
        System.out.println(registerStudent(ids, 101));

        System.out.println("Registered: "
                + isRegistered(ids, 102));

        System.out.println("Total Students: "
                + totalStudents(ids));
    }
}
