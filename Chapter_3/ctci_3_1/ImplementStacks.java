import java.lang.reflect.Array;

class ImplementStacks{

    static MyStackUsingArray st = new MyStackUsingArray();
    public static void main(String[] args){
        System.out.println("stack-1");
        System.out.println("Is stack empty: "+st.isEmpty1());
        st.display1();
        st.push1(1);
        st.push1(2);
        st.push1(3);
        st.display1();
        System.out.println("Top of stack: "+st.peek1());
        System.out.println("Item popped: "+st.pop1());
        st.display1();
        System.out.println("Top of stack: "+st.peek1());

        System.out.println("stack-2");
        System.out.println("Is stack empty: "+st.isEmpty2());
        st.display2();
        st.push2(11);
        st.push2(12);
        st.push2(13);
        st.display2();
        System.out.println("Top of stack: "+st.peek2());
        System.out.println("Item popped: "+st.pop2());
        st.display2();
        System.out.println("Top of stack: "+st.peek2());

        System.out.println("stack-3");
        System.out.println("Is stack empty: "+st.isEmpty3());
        st.display3();
        st.push3(21);
        st.push3(22);
        st.push3(23);
        st.display3();
        System.out.println("Top of stack: "+st.peek3());
        System.out.println("Item popped: "+st.pop3());
        st.display3();
        System.out.println("Top of stack: "+st.peek3());
        
    }
}

class MyStackUsingArray{

    public int index1=-1;
    public int index2=4;
    public int index3=9;
    public int arr[] = new int[15];

    public boolean push1(int item){
        if(index1<arr.length/3){
            arr[++index1] = item;
            return true;
        }
        return false;
    }

    public int pop1(){
        int res= arr[index1];
        index1--;
        return res;
    }

    public int peek1(){
        return arr[index1];
    }

    public boolean isEmpty1(){
        return index1==-1;
    }

    public void display1(){
        if(index1!=-1){
            int i=index1;
        while(i>=0){
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println();
        }
    }

    public boolean push2(int item){
        if(index2<2*arr.length/3){
            arr[++index2] = item;
            return true;
        }
        return false;
    }

    public int pop2(){
        int res= arr[index2];
        index2--;
        return res;
    }

    public int peek2(){
        return arr[index2];
    }

    public boolean isEmpty2(){
        return index2 ==4;
    }

    public void display2(){
        if(index2!=4){
            int i=index2;
        while(i>=5){
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println();
        }
    }

    public boolean push3(int item){
        if(index3<arr.length){
            arr[++index3] = item;
            return true;
        }
        return false;
    }

    public int pop3(){
        int res= arr[index3];
        index3--;
        return res;
    }

    public int peek3(){
        return arr[index3];
    }

    public boolean isEmpty3(){
        return index3 ==9;
    }

    public void display3(){
        if(index3!=9){
            int i=index3;
        while(i>=10){
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println();
        }
    }
}