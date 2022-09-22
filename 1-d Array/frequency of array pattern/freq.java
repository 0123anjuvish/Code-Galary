// this code is defined as a brute force method 


import java.util.*;
public class Main
{
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
	
                }
        int [] fr = new int [arr.length];
        int ifPresent = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = ifPresent;
                }
            }
            if(fr[i] != ifPresent)
                fr[i] = count;
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != ifPresent)
                System.out.println("    " + arr[i] + "       " + fr[i]);
        }
    }
}

// this code is defined by optimize solution with extra space.
import java.util.*;
public class Main
{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i<n;i++){
          a[i] = sc.nextInt();
      }
frequency(a);
}
static void frequency(int []a){
int n = a.length;
int[] freq = new int[10];
for(int i=0; i<n;i++){
freq[a[i]]++;
}
 for(int i=0;i<n;i++){ // O(n) time complexity
 if(freq[a[i]]!=0){
 System.out.println(a[i] + " " + " " + freq[a[i]] + " ");
freq[a[i]] = 0;
}
}
}
}
