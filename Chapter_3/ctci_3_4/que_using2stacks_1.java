//0(n) for add and O(1) for remove

import java.util.Stack;
class MyQueueEasyPop{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    public void add(Integer item){
        //System.out.println("Inside add");
        
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s2.push(item);

        while(!s2.isEmpty())
            s1.push(s2.pop());
    }

    public Integer remove(){
        //System.out.println("Inside remove");
        return s1.pop();
    }

    public static void main(String[] args){
        MyQueueEasyPop obj = new MyQueueEasyPop();
        obj.add(1);obj.add(2);obj.add(3);obj.add(4);obj.add(5);
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        
    }
}