public class MyClass {
    public static void main(String args[]) {
        int a[] = { 1, 4, 20, 3, 10, 5 };
        int n = a.length;
        int sum = 10;
        subarraySum(a,n,sum);


    }
    static int subarraySum(int []a,int n, int sum)
    {
        int csum,i,j;
        for( i =0;i<n;i++)
        {
            csum = a[i];
            for(j = i+1;j<=n;j++)
            {
                if(csum==sum)
                {
                    int p = j-1;
                    System.out.print(i + " " + p);
                    return 1;
                }
                if(csum>sum || j==n)
                    break;
                csum += a[j];
            }
        }
        return 0;
    }
}
