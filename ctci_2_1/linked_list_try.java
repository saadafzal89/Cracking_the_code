import java.util.Scanner;

import javax.net.ssl.ExtendedSSLSession;

import javafx.scene.shape.Ellipse;

class linked_list_try {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int val,p;
        Linked_List ll = new Linked_List();
        //input.close();
        while(true){
            System.out.println("\nLinked List Operations\n");
            System.out.println("1. Insert at begining");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at begining");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at position");
            System.out.println("7. Check if empty");
            System.out.println("8. Get size");
            System.out.println("9. Display entire list");
            System.out.println("0. Exit"); 

            System.out.print("Choice: ");
            int in = input.nextInt();

            switch(in){
                case 1:
                    System.out.println("Enter value to insert: ");
                    val = input.nextInt();
                    ll.add_front(val);
                    break;
                
                case 2:
                    System.out.println("Enter value to insert: ");
                    val = input.nextInt();
                    if(ll.get_size()>0)
                        ll.add_end(val);
                    else
                        ll.add_front(val);
                    break;

                case 3:
                    System.out.println("Enter value to insert: ");
                    val = input.nextInt();
                    System.out.println("Enter position:");
                    p = input.nextInt();
                    if(p>ll.get_size())
                        System.out.println("Invalid Position");
                    else
                        ll.add_at_position(val, p);
                    break;
                
                case 4:
                    val = ll.delete_front();
                    System.out.println("Element deleted: "+val);
                    break;

                case 5:
                    val = ll.delete_end();
                    System.out.println("Element deleted: "+val);
                    break;

                case 6:
                    System.out.println("Enter position: ");
                    p = input.nextInt();
                    val = ll.delete_at_position(p);
                    System.out.println("Element deleted: "+val);
                    break;
                
                case 7:
                    boolean ans=ll.isEmpty();
                    if(ans)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                    break;
                
                case 8:
                    System.out.print("Size: "+ll.get_size());
                    break;

                case 9:
                    System.out.println("\n-----Linked List-----");
                    ll.display();
                    break;
                
                case 0:
                    System.exit(0);
            }      
        }
    }
}

class Node {
    public int data;
    public Node next;

    Node(int d){
        data =d;
        next = null;
    }
}

class Linked_List{
    public Node head;
    public int size;

    Linked_List(){
        head = null;
        size =0;
    }

    public int get_size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public void add_front(int val){
        Node n = new Node(val);
        n.next= head;
        head = n;
        size++;
    }

    public void add_at_position(int val, int pos){
        Node newNode = new Node(val);
        Node curr = head;
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next= temp;
        size++;
    }

    public void add_end(int val){
        Node current=head;
        while(current.next!=null){
            current = current.next;
        }
        Node n = new Node(val);
        current.next=n;
        size++;
    }

    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println();
    }

    public int delete_front(){
        int res = head.data;
        head=head.next;
        size--;
        return res;
    }

    public int delete_end(){
        Node curr = head;
        for(int i=1;i<size-1;i++){
            curr = curr.next;
        }
        int res = curr.next.data;
        curr.next=null;
        size--;
        return res;
    }

    public int delete_at_position(int pos){
        Node curr = head;
        for(int i=1;i<pos-1;i++){
            curr = curr.next;
        }
        int res = curr.next.data;
        curr.next=curr.next.next;
        size--;
        return res;
    }
}