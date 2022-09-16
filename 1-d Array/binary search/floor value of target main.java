import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Solution {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
       int []ar = new int[n];
       for(int i =0; i<n;i++){
           ar[i] = sc.nextInt();
       }
       int target = sc.nextInt();
        int start = 0 , end = ar.length-1, flag =0;
        while(start<=end){
           int mid = (start + (end - start)/2);
            if(ar[mid]==target){
                System.out.println(mid-1);
                flag = 1;
                break;
            }else if (ar[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            }
            if(flag==0)
            System.out.println(ar[end + 1]);
}
}
