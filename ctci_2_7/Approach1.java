class InteresectingLinkedList{

    static Linked_List ll1 = new Linked_List();
    static Linked_List ll2 = new Linked_List();
    public static void main(String[] args){
        ll1.add_end(1);ll1.add_end(2);ll1.add_end(3);ll1.add_end(4);ll1.add_end(5);
        ll2.add_end(6);ll2.add_end(7);
        
        Node curr = ll2.getHeadNode();
        while(curr.next!=null){
            curr = curr.next;
        }

        //System.out.println(curr.data);
        int i =1;
        Node curr1 = ll1.getHeadNode();
        while(i<3){
            curr1=curr1.next;
            i++;
        }
        //System.out.println(curr1.data);

        //making the intersection in next line at val '3'
        curr.next=curr1;
        ll1.display();
        ll2.display();
            
        Node start1 = ll1.getHeadNode();
        Node start2 = ll2.getHeadNode();  

        while(start1.next!=null)
            start1 = start1.next;

        while(start2.next!=null)
            start2 = start2.next;

        if(start1==start2)
            System.out.println("Intersection");
        else
            System.out.println("No Intersection");
        
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
        if(pos>get_size())
            System.out.println("Invalid Position, try again");
        else{
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
    }

    public void add_end(int val){
        if(get_size()==0)
            add_front(val);
        else{
            Node current=head;
            while(current.next!=null){
                current = current.next;
            }
            Node n = new Node(val);
            current.next=n;
            size++;
        }
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
        if(get_size()==0)
            return -1;
        int res = head.data;
        head=head.next;
        size--;
        return res;
    }

    public int delete_end(){
        if(get_size()==0)
            return -1;
        if(get_size()==1){
            int r = delete_front();
            return r;
        }
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
        if(get_size()==0)
            return -2;
        if(pos>get_size())
            return -1;
        else if(pos ==1){
            int r = delete_front();
            return r;
        }
        else{
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

    public Node getHeadNode(){
        return head;
    }

    public Node get(int index){
        Node curr = getHeadNode();
        int i=0;
        while(i<index && curr!=null){
            curr=curr.next;
            i++;
        }
        return curr;
    }
}