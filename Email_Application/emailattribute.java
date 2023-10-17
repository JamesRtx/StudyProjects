import java.util.Scanner;

class emailattribute {
    private String Firstname;
    private String lastname;
    private String department;
    private String email;
    private String password;
    private int DefaultPaswordlenght= 7;
    private int mailCapacity =500;
    private String alternateEmail;
    public emailattribute(String Firstname,String lastname){
        this.Firstname=Firstname;
        this.lastname=lastname;
        this.department=dept();
        this.email= Firstname.toLowerCase()+lastname.toLowerCase()+"@"+"companyname.com";
        this.password=passkey(DefaultPaswordlenght);

    }

    private static String dept(){
        System.out.println("Please choose your Department");
        System.out.println("1 Computer Science\n2.Bussiness\n31.Econmices");
        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();
        if (choice==1){
            return "Computer Science";
        }
        else if (choice==2){
            return "Bussiness";
        }
        else if (choice==3){
            return "Econmices";
        }

        return  dept();
        
        
    }
    private static String    passkey(int length ){
        String Passwordkeys= "JMSEGJFNEDIDNDIDMDJ&1#3UFNK984)9";
        char passkey[]=new char[length];
        for (int i = 0; i < passkey.length; i++) {
            int random =(int)(Math.random()*Passwordkeys.length());
            passkey[i]=Passwordkeys.charAt(random);
        }
        return new String(passkey);
    }
    public void resetpassword(String password){this.password=password;}
    public void resetemail(String email){this.alternateEmail=email;}
    public void resetmailcapacity(int cap){this.mailCapacity=cap;}
    public void resetfirstname(String resetname){this.Firstname=resetname;}
    public void resetlastname(String resetname){this.lastname=resetname;}
    

    public String getpassword(){return this.password;}
    public String getemail(){return this.email;}
    public int getmailcapacity(){return this.mailCapacity;}
    public void showinfo(){
        System.out.println("User Name :"+ this.Firstname +" " +this.lastname);
        System.out.println("User Email: "+this.email);
        System.out.println("User password : "+this.password );
        System.out.println("Mail capacity :"+this.mailCapacity+"mb");
    }
    

    

}
