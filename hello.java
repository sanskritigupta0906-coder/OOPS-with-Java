//import java.util.Scanner;
class hello {

    int a, b, c;

    hello(){
        System.out.println("Default");

    }

    hello(int a){
        this.a=a;
        System.out.println(a);
    }

    hello(int a, int b){
        this.a=a;
        this.b=b;

        System.out.println(a + " "+ b);
    }

    hello(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;

        System.out.println(a+" "+b+" "+c);
    }

    public static void main(String[] args){


        hello o1=new hello();
        hello o2=new hello(10);
        hello o3=new hello(10, 20);
        hello o4=new hello(10, 20, 30);


    }
    
}
