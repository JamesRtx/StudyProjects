public class Node {
    emailattribute data ;
    Node next;
    Node(emailattribute data){
        this.data=data;
        this.next=null;
    }
 Node rootnode=null;
 Node endnode=null;
public void addnode(emailattribute data){
    Node currentnode=rootnode;
    Node newNode =new Node(data);
    if(rootnode==null){
        rootnode=newNode;
        endnode=newNode;
    }
    else{
        endnode.next=newNode;
        endnode=newNode;
    }
}

public void display(){
    Node current=rootnode;
    while(current!=null){
       current.data.showinfo();
    
        current=current.next;
    }
}
}

