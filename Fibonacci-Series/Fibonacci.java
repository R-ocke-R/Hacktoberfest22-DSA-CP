public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }

    // this is the basic recursive approach for fibonacci series, O(2^N) time complexity 
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    // DP approach, Bottom UP, using an O(n) space complex arr to store all the series elements uptil n
    public static int[] fibo(int n){
        int[] arr= new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <= n; i++) {
            arr[i]=arr[i-1]+arr[i-2];

        }    
        return arr;
    }
    // Space Optimized approach using O(1) space complexity and O(n) time complexity.
    public static int FiboIterative(int n){
         
        if(n==1 || n==2)return n-1;
        // we can use these variables and keep printing c, or if have to return all upto nth term use array
        // then fib[i]=fib[i-1]+fib[i-2]; 

        int a=0;
        int b=1;
        int c=a+b;

        for (int i = 3; i <= n; i++) {
            c=a+b;
            //now c is the new value
            a=b;
            b=c;
        }    
        return c;
    }
}
