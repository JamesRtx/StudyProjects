package Bank_Application;

public class Checking extends Account {
    private int debit_cardnumber;
    private int debit_pin;
    public Checking(String name,String sSn,int balance){
        super(name,sSn,balance);
        
        Account_number= "2"+Account_number;
        Debit_card();
    
    }
    private void Debit_card(){
        debit_cardnumber=(int)(Math.random()* Math.pow(10, 12));
        debit_pin=(int)(Math.random()* Math.pow(10, 4));

    }
    public void setrate(){
        rate= getbaserate()*.15;

    }


    public void Show_info(){
        super.Show_info();
        System.out.println("Account Type : Checking Account ");
        System.out.println(
        "Checking Account Features"+
        "\nDebit Card Number: "+debit_cardnumber+
        "\nDebit Card Pin "+debit_pin

        );
    }
}
