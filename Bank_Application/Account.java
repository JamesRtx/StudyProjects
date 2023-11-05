package Bank_Application;

public abstract class Account implements IBaseRate {

    private String name;
    private String Ssn;
    private     double balance;
   protected String Account_number;
    protected double rate;
    private static int uniqe_id =1000;
public Account(String name,String sSn,int init_depsoit){
    this.name=name;
    this.Ssn=sSn;
    balance=init_depsoit;
    this.Account_number=Account_number(); 
    
    setrate();
    accrude_amount();
}   
public abstract void setrate();
private String Account_number(){ 
    uniqe_id++;
    int index=uniqe_id;
    int random= (int) (Math.random()* Math.pow(10, 3));
    String last = Ssn.substring(Ssn.length()-2, Ssn.length());
    return last+index+random;
}
public void accrude_amount(){
    double accrude= balance*(rate/100);
    balance=accrude+balance;
    System.out.println("Compund Intrest: "+accrude);
    
}
public void Deposit(double amount){
    balance =balance+amount;
    show_balance();
}
public void Withdrawal(double amount){
    balance =balance-amount;
    show_balance();
}
public void Where(double amount, String where){
    balance =balance-amount;
    System.out.println("Transfer to "+where);
    show_balance();
}
public void show_balance(){
    System.out.println(balance);
}
public void Show_info(){
    System.out.println(
    "Name : "+name
    +"\nAccount: "+Account_number
    + "\nBalance : "+balance
    + "\nRAte :"+rate


    );

}



}
