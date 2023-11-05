package Bank_Application;

import java.util.LinkedList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
     List<Account> accounts= new LinkedList<Account>();

        /*Checking acc1=new Checking("tom","123456789",300);
        Savings acc2=new Savings("tom willsion","987654321",400);
        acc2.Show_info();*/
   String file = "C:\\Users\\adeko\\OneDrive\\Documents\\Zoom\\NewBankAccounts.csv";
        List<String[]> account =Utilites.Csv.read(file);
        for (String[]  accountholder : account) {
                String name = accountholder[0];
                String sSn = accountholder[1];
                String accountType=accountholder[2];
                int init_depsoit =Integer.parseInt(accountholder[3]);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name,sSn,init_depsoit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name,sSn,init_depsoit));
            }
            else{
                System.out.println("Erro");
            }
                

            
        }

       System.out.println(accounts.get(5));
      //  for (Account strings : accounts) {
      //      strings.Show_info();
       // }
    }
}
