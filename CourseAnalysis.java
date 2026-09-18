import java.util.*;

public class CourseAnalysis {

    public static Set<Integer> commonStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer>result=new HashSet<>(javaStudents);
        result.retainAll(pythonStudents);

        return result;
    }

    public static Set<Integer> allStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer> result = new HashSet<>(javaStudents);
        result.addAll(pythonStudents);
        return result;
    }

    public static Set<Integer> onlyJava(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {

        // Write your code
        Set<Integer>result = new HashSet<>(javaStudents);
        result.removeAll(pythonStudents);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> javaStudents =
                new HashSet<>(
                    Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents =
                new HashSet<>(
                    Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: "
                + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: "
                + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: "
                + onlyJava(javaStudents, pythonStudents));
    }
}
