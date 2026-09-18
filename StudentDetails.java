import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student {

    String name;
    int rollNo;
    int tmarks;

    Student(String name, int rollNo, int tmarks) throws InvalidMarksException{

        if(tmarks<0) throw new InvalidMarksException("Marks cannot be negative");
        this.tmarks=tmarks;
        this.rollNo=rollNo;
        this.name=name;
    }

    void display(){
        System.out.println("Student name is : "+name+" Student Roll no. is : "+rollNo+" Student marks : "+tmarks);
    }
    
}

public class StudentDetails{
    public static void main(String[] args) {
        List<Student> li = new LinkedList<>();
        try{
        li.add(new Student("abc", 101, 90));
        li.add(new Student("pqr", 102, 85));
        li.add(new Student("xyz", 103, 95));
        }

        catch(InvalidMarksException e){
            System.out.println(e);
        }

        for(Student i : li){
            i.display();
        }
    }
}

class InvalidMarksException extends Exception{

    InvalidMarksException(String msg){
        super(msg);
    }
}

//Homework : WAP to raise exception InvalidMmarks if 'total_marks<0'.