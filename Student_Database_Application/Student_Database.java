package Student_Database_Application;


import java.util.Scanner;

public class Student_Database {
    static Scanner sc =new Scanner(System.in);
    private String First_name;
    private String Last_name;
    private int year;
    private String Student_id;
    private String courses;
    private int tutusionbalance;
    private static int cost_course =600;
    private static int id =1000;
    public Student_Database(){
        Scanner sc =new Scanner(System.in);
        Enroll data=new Enroll();
        System.out.println("Please Enter Your First Name: "); 
        this.First_name=sc.nextLine();
        System.out.println("Please Enter You Last Name");
        this.Last_name=sc.nextLine();
        System.out.println("Choose You School Year\n1.- Freshmen \n2.- Sophmore \n3.- Junior \n4.- Senoir");
        this.year=sc.nextInt();
        Set_Student_id();
        this.tutusionbalance=Enroll(data);
        show_info(data);
        

       

    }
    private void Set_Student_id(){
         id++;
         this.Student_id= year + ""+id;
    }
    private int Enroll(Enroll data){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Please input course code and abbriviation if Done input Q to confirm");
        String course= "Y";   
        int Temp_Balance=0;
        int tutuiton=0;
        while (course.equalsIgnoreCase("y")) {
            int course_number=sc.nextInt();
            String course_app=sc.next();
            data.add(course_app,course_number);
            Temp_Balance=cost_course+tutuiton; 
            tutuiton=600;
            System.out.println("Would you still like to continue");
            course=sc.next();
        }
        System.out.println("---------------------");
        data.display();
        return Temp_Balance;
        
    }
    private int pay(){
        System.out.println("Please input amount");
        int amount=sc.nextInt();
        int currentamount=tutusionbalance-amount;
        return currentamount;
    }
    private void show_info(Enroll data){
        
        System.out.println( "Name: " + First_name +" "+Last_name );
        System.out.println("Course Enrolled:");
        
        data.display();
        System.out.println("Balnace: $"+tutusionbalance);
    }
}
