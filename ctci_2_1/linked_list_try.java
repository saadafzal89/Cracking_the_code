class linked_list_try {
    public static void main(String args[]){
        Linked_List ll = new Linked_List();
        System.out.println("Is list empty? "+ll.isEmpty());
        System.out.println("Size of Linked_list: "+ll.get_size());
        ll.add_front(3);
        ll.add_front(2);
        ll.add_front(1);
        ll.display();
        ll.add_end(5);
        ll.display();
        ll.add_at_position(4, 4);
        ll.display();
        System.out.println("Size of Linked_list: "+ll.get_size());
        System.out.println("Is list empty? "+ll.isEmpty());
        int a = ll.delete_front();
        System.out.println("Deleted Node from front: "+a);
        ll.display();
        int b = ll.delete_end();
        System.out.println("Deleted Node from end: "+b);
        ll.display();
        int c = ll.delete_at_position(2);
        System.out.println("Deleted Node from position: "+c);
        ll.display();

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