import java.util.Stack;
class MyQueueEasyPush{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    public void add(Integer item){
        s1.push(item);
    }

    public Integer remove(){
        while(!s1.isEmpty())
            s2.push(s1.pop());

        int res = s2.pop();
        while(!s2.isEmpty())
            s1.push(s2.pop());

        return res;
    }

    public static void main(String[] args){
        MyQueueEasyPush obj = new MyQueueEasyPush();
        obj.add(1);obj.add(2);obj.add(3);obj.add(4);obj.add(5);
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
        System.out.println("Head of queue: "+obj.remove());
    }
}