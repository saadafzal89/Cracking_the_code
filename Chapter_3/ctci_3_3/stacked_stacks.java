import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.EmptyStackException;

import javax.net.ssl.ExtendedSSLSession;

class StackedStacks{
    static ArrayList<Stack<Integer>> st = new ArrayList<Stack<Integer>>();

    private static int STACK_SIZE = 3;

    public void push(int item){
        if(st.isEmpty()||st.get(st.size()-1).size()>=STACK_SIZE){
            Stack<Integer> st_new = new Stack<Integer>(); 
            st_new.push(item);
            st.add(st_new);   
        }
        else{
            st.get(st.size()-1).push(item);
        }
    }

    public Integer pop(){
        if(st.size()==0)
            throw new EmptyStackException();
        else if(st.get(st.size()-1).size()==0 && st.size()!=1){
            int res = st.get(st.size()-2).pop();
            st.remove(st.size()-1);
            return res; 
        }
        else if(st.get(st.size()-1).size()==0 && st.size()==1){
            st.remove(st.size()-1);
            System.out.println("Size from pop: "+st.size());
            throw new EmptyStackException(); 
        }
        else
            return st.get(st.size()-1).pop();
    }

    public void display(){
        for(Stack<Integer> s:st){
            for(Integer elem: s){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        StackedStacks obj = new StackedStacks();
        System.out.println("Empty Num of stacks: "+st.size());
        obj.push(1);obj.push(2);obj.push(3);obj.push(4);obj.push(5);obj.push(6);obj.push(7);obj.push(8);
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        System.out.println("popped item: "+obj.pop());
        System.out.println("Num of stacks: "+st.size());
        obj.display();
    }
}
