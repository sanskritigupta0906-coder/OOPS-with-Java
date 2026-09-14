class Counter{
    int count=0;

    public void increment(){
        count++;
    }
}

class MyThread implements Runnable{
    Counter ct;
    MyThread(Counter ctr){
        this.ct=ctr;
    }
    public void run(){

        ct.increment();
        
    }

}

public class Th {

    public static void main(String[] args) {

        Counter ctr = new Counter();

        MyThread t1 = new MyThread(ctr);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        Thread th3 = new Thread(t1);
        Thread th4 = new Thread(t1);

        
    }
    
}
