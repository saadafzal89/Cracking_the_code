import java.util.LinkedList;
class Followup{

    public static void main(String[] args){

        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        LinkedList<Integer> result = new LinkedList<Integer>();

        ll1.add(6);ll1.add(1);ll1.add(7);
        ll2.add(2);ll2.add(9);ll2.add(5);

        int l1=0, l2=0, res =0;
        int mul1=10,mul2=10;
        for(int i=0;i<ll1.size();i++){
            System.out.print(ll1.get(i)+"->");
            l1 = (l1*mul1)+ ll1.get(i);
        }
        System.out.println();

        for(int i=0;i<ll2.size();i++){
            System.out.print(ll2.get(i)+"->");
            l2 = (l2*mul2)+ ll2.get(i);
        }
        System.out.println();

        System.out.println("First: "+l1);
        System.out.println("Second: "+l2);

        res = l1+l2;
        
        LinkedList<Integer> temp = new LinkedList<Integer>();

        while(res>1){
            int mod = res%10;
            temp.add(mod);
            res = res/10;
        }
        
        for(int i=temp.size()-1;i>=0;i--){
            int t = temp.get(i);
            result.add(t);
        }

        //temp array used to store so that pop can be like a stack
        /*for(int i=0;i<temp.size();i++){
            System.out.print(temp.get(i)+"->");
        }
        System.out.println();*/

        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+"->");
        }
        System.out.println();
    }
}