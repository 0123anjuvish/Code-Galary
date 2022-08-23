Brute force method
 import java.util.*;

// public class MyClass {
//     public static void main(String args[]) {
//      int a[] = {2,1,4};
//      int n = a.length;
//      int b[] = {2,4,6,5};
//      int m = b.length;
//      int c[] = new int[n+m];
//      int p = c.length;
//      int i=0;
//      int j=0;
//      int k =0;
//      while(i<n&&j<m){
//       if(a[i]<b[j])
//              {
//                  c[k]=a[i];
//                  i++;
//                  k++;
//              }
//              else
//              {
//                  c[k] =b[j];
//                  j++;
//                  k++;
//              }


//      }
//      while(i<n)
//      {

//                  c[k]=a[i];
//                  i++;
//                  k++;
//              }
//              while(j<m)
//              {
//                  c[k] = b[j];
//                  j++;
//                  k++;
//              }


//      for( k =0;k<p;k++)
//      {
//          System.out.print(c[k] +   "  ");
//      }

//     }
// }

 Through hashSet

import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int a[] = {2,1,4};
        int n = a.length;
        int b[] = {2,4,6,5};
        int m = b.length;
        int c[] = new int[n+m];
        int p = c.length;

        HashSet<Integer>set = new HashSet<>();
        for(int i =0;i<n;i++)
        {
            set.add(a[i]);
        }
        for(int j =0;j<m;j++)
        {
            set.add(b[j]);
        }
        for(int k :set)
        {
            System.out.print(k + " ");
        }
    }
}
