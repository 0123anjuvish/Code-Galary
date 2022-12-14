Maximum Sum of subarray Kadane's algorithm
  import java .util.*;

public class MyClass {
    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max = Integer.MIN_VALUE, maxsum = 0;

        for (int i = 0; i < size; i++)
        {
            maxsum = maxsum + a[i];
            if (max < maxsum)
                max = maxsum;
            if (maxsum < 0)
                maxsum = 0;
        }
        return max;
    }
}
