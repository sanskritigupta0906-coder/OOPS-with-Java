class Ticketcounter implements Runnable{

    int available=5;

    synchronized void book(){
        if (available>0){
            available=available-1;
            System.out.println("Booked");
        }


        else{
        System.out.println("Sold out");
        }
    }
    
       public void run(){
        try{
        Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        while(available>0){
        book();
        }
       }

}

public class Thread123 {

    public static void main(String[] args) {
        Ticketcounter counter = new Ticketcounter();

        Thread t1=new Thread(counter);
        Thread t2=new Thread(counter);
        //Thread t3=new Thread(counter);

        t2.setPriority(10);
        t1.setName("Counter1");
        t2.setName("Counter2");
t1.start();
        t2.start();
    }
    
}
