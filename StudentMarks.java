import java.util.*;
public class StudentMarks {

    public static void addMarks(List<Integer> marks, int mark) {
        // Write your code
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {
        // Write your code
        double sum=0;
        for(int i : marks){

            sum+=i;

        }

        return sum/marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        // Write your code

        int m=marks.get(0);

        for(int i : marks){
            if(i>m)
                m=i;
        }

        return m;
    }

    public static void displayMarks(List<Integer> marks) {
        // Write your code

        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}
