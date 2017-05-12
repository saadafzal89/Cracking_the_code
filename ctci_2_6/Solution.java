
class Solution{

    static Linked_List ll = new Linked_List();
    
    public boolean isPalindrome(){

        int flag =0;
        int j = ll.get_size()-1;
        int i=0;
        while(i<=(ll.get_size()+1)/2){
            Node curr = ll.get(i);
            Node tail = ll.get(j);
            if(curr.data != tail.data){
                flag++;
                break;
            }
            i++;j--;
        }

        if(flag !=0)
            return false;
        else
            return true;
    }
    
    public static void main(String[] args){
        ll.add_end(1);ll.add_end(2);ll.add_end(3);ll.add_end(4);ll.add_end(5);ll.add_end(4);
        ll.add_end(3);ll.add_end(2);ll.add_end(1);
        ll.display();
        Solution obj = new Solution();
        boolean res = obj.isPalindrome();

        if(res)
            System.out.println("Linked list is palindrome");
        else
            System.out.println("Linked list is not palindrome");
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