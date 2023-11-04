package Student_Database_Application;

public class Enroll{
    public class Enrollment{
    String data;
    int data2;
    Enrollment next;
    Enrollment(String data,int data2){
        this.data=data;
        this.data2=data2;
        this.next=null;
    }
    }
    public Enrollment rootnode=null;
    public Enrollment endnode=null;

    public void add(String newdata,int newdata2){
        Enrollment newnode=new Enrollment(newdata,newdata2);
        if(rootnode==null){
            rootnode=newnode;
            endnode=newnode;
        }
        else{
            newnode.next=rootnode;
            rootnode=newnode; 
        }

    }
    public void display(){
        Enrollment current=rootnode;
        while (current!=null) {
            
            System.out.println(current.data+"-"+current.data2);
            current=current.next;  
        }
    }

}