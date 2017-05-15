class StackWithMin{

    static MyStackUsingArray st = new MyStackUsingArray();
    public static void main(String[] args){
        st.push(1);
        st.push(2);
        st.push(-1);
        st.push(0);

        System.out.println("Min value in stack: "+st.minVal());

    }
}

class MyStackUsingArray{

    public int index=-1;
    public int min;
    public int arr[] = new int[5];

    public boolean push(int item){
        if(index<arr.length){
            arr[++index] = item;
            if(index ==-1)
                min = item;
            else{
                if(item<min)
                    min = item;
            }
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

    public int minVal(){
        return min;
    }
}