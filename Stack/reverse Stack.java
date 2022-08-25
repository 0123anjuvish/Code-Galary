import java.util.*;

public class MyClass {
    static Stack<Integer>st = new Stack<>();
    public static void main(String args[]) {
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
      System.out.print(" Original Stack ");
       System.out.print(st + " ");
       reverse();
       System.out.println(" ");
        System.out.print(" Reverse Stack ");
        System.out.print(st + " ");
    }
    static void insert(int x){
        if(st.isEmpty()){
            st.push(x);
        }
        else
        {
            int a = st.peek();
            st.pop();
            insert(x);
            st.push(a);
        }
    }
   static void reverse(){
        if(st.size()>0)
        {
            int x = st.peek();
            st.pop();
            reverse();
            insert(x);
        }
    }
    

}
