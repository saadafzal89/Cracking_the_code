import java.lang.reflect.Array;

class ImplementStacks{

    static MyStackUsingArray st = new MyStackUsingArray();
    public static void main(String[] args){
        
        System.out.println("Is stack empty: "+st.isEmpty());
        st.display();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println("Top of stack: "+st.peek());
        System.out.println("Item popped: "+st.pop());
        st.display();
        System.out.println("Top of stack: "+st.peek());
    }
}

class MyStackUsingArray{

    public int index=-1;
    public int arr[] = new int[5];

    public boolean push(int item){
        if(index<arr.length){
            arr[++index] = item;
            return true;
        }
        return false;
    }

    public int pop(){
        int res= arr[index];
        index--;
        return res;
    }

    public int peek(){
        return arr[index];
    }

    public boolean isEmpty(){
        return index ==-1;
    }

    public void display(){
        if(index!=-1){
            int i=index;
        while(i>=0){
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println();
        }
    }
}