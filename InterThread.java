public class InterThread {

    public static void main(String[] args) {
        BankAccount o1 = new BankAccount();
        WithdrawlThread wd = new WithdrawlThread(o1);
        Thread t1 = new Thread(wd);
        DepositThread dp = new DepositThread(o1);
        Thread t2 = new Thread(dp);

        t1.start();
        t2.start();
    }
    
}

class BankAccount{
    int balance = 500;


    //synchorization to ensure mutual exclusion

    synchronized void withdraw(int amount){
        while(balance<amount){

            try{

            wait();
        }

        catch(InterruptedException e){
            System.out.println(e);
        }
    }

        balance-=amount;
        System.out.println("Withdrawl successful with balance : "+balance);
    
}

    synchronized void deposit(int amount){
        
        balance+=amount;
        System.out.println("Balance is deposited new balace is : " + balance);

        notify();

    }

}

class WithdrawlThread implements  Runnable{
    BankAccount ba;
    WithdrawlThread(BankAccount obj){
        this.ba=obj;
    }
    public void run(){
        ba.withdraw(700);
    }

}

class DepositThread implements Runnable{
    BankAccount ba;
    DepositThread(BankAccount obj){
        this.ba=obj;
    }

    public  void run(){
        ba.deposit(500);
    }
}