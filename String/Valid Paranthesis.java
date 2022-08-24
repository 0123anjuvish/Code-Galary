import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        String s = "()";
        if(validParanthesis(s))
        {
         System.out.println("Yes Valid");
        }
         else{
          System.out.println("No Its not Valid ");
         }
    }
     public static boolean validParanthesis(String s){
         Stack<Character>st = new Stack<>();
         for(var x: s.toCharArray())
         {
             if(x=='(')
             {
                 st.push(')');
             }
             else if(x== '{')
             {
                 st.push('}');
             }
             else if(x== '[')
             {
              st.push(']');   
             }
             else if(st.empty() || st.pop() !=x)
             {
                 return false;
             }
         }
         return st.empty();
     }

     
   
}
