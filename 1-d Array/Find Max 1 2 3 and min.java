import java.util.*;
public class MyClass{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0;i<n;i++)
      {
          a[i] = sc.nextInt();
      }
      int max1 = a[0], max2=a[0];
    
        for(int i = 0;i<n;i++){
         
            if(max1 < a[i]){
              max2 = max1;
              max1 = a[i];
            }else if(max2< a[i]){
              max2= a[i];
            }
        }
        System.out.println(max1+" "+max2);
      }
    }
    
