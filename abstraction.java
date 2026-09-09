interface Payment {
    int a=10; //public, static and final
    void payment_method();
    static void display(){
        System.out.println("Payment Successfull.");
    }
}

class UPI implements Payment{
    public void payment_method(){
        System.out.println("UPI");
    }
}

class Credit implements Payment{

    public void payment_method(){
        System.out.println("Credit card");
    }

}

public class abstraction{
    public static void main(String[] args){
        Payment o1=new Credit();
        Payment.display();
        o1.payment_method();
    }
}
