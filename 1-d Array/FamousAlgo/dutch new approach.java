public class MyClass {
    public static void main(String args[]) {
     int nums [] = {2,0,1,0,1,2,0,1,2,};
     int n = nums.length;
       sortColors(nums);
       for(int i =0;i<n;i++)
       {
      System.out.print( nums[i] + " ");
       }
    }
       public static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high)
        {
            if(nums[mid] ==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public  static void swap(int []nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
