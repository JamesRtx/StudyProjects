package Bank_Application;

public class Savings extends Account {
    private int safetyDepositboxId;
    private int safetyDepositboxKey;
    public Savings(String name,String sSn,int balance) {
        super(name,sSn,balance);
        Account_number= "1"+Account_number;
        safetyDepositbox();
 
    }
    private void safetyDepositbox(){
         safetyDepositboxId =(int)(Math.random()*Math.pow(10, 3));
         safetyDepositboxKey =(int)(Math.random()*Math.pow(10, 4));
    }
    public void Show_info(){
        super.Show_info();
        System.out.println("Account Type : Saving Account ");
        System.out.println(
        "Saving Account Features"+
        "\nSafety Deposit box id: "+safetyDepositboxId+
        "\nSafety Deposit Box Key: "+safetyDepositboxKey

        );
    }
    public void setrate(){
        rate =getbaserate()-0.25;
    }
}
