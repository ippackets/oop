interface Account{
    void set(String name, int accnum, float balance);
    void display();
}

interface Person{
    void store(String name);
    void disp();
}

class Customer implements Account,Person{
    
    String name,pname;
    int accnum;
    float balance;

    public void set(String name, int accnum, float balance){
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account information:");
        System.out.println("Account Name: "+name);
        System.out.println("Account Number: "+accnum);
        System.out.println("Account Balance: "+balance);
    }

    public void store(String pname){
        this.pname = pname;
    }

    public void disp(){
        System.out.println("Person Information:");
        System.out.println("Name: " + pname);
    }

    public void calculateIntrest(int rate){
        double intrest = balance*rate/100;
        System.out.println(rate+"% Intrest on "+balance+" is: "+intrest);
    }
}

public class _19_BankAccount_MultipleInheritance {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.store("Knight");
        c.set("Knight's Acc", 123, 1000);
        c.disp();
        c.display();
        c.calculateIntrest(5);
    }
}
