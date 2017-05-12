import java.util.LinkedList;
class Solution{

    public static void main(String[] args){

        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        LinkedList<Integer> result = new LinkedList<Integer>();

        ll1.add(7);ll1.add(1);ll1.add(1);ll1.add(1);
        ll2.add(5);ll2.add(9);ll2.add(2);

        int l1=0, l2=0, res =0;
        int mul1=1,mul2=1;
        for(int i=0;i<ll1.size();i++){
            System.out.print(ll1.get(i)+"->");
            l1 = l1+ (mul1*ll1.get(i));
            mul1=mul1*10;
        }
        System.out.println();

        for(int i=0;i<ll2.size();i++){
            System.out.print(ll2.get(i)+"->");
            l2 = l2+ (mul2*ll2.get(i));
            mul2=mul2*10;
        }
        System.out.println();

        System.out.println("First: "+l1);
        System.out.println("Second: "+l2);

        res = l1+l2;
        while(res>0){
            int mod = res%10;
            result.add(mod);
            res = res/10;
        }

        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+"->");
        }
        System.out.println();
    }
}