public class NthFibonacci {
    public long nthFibonacci (int input1) {
        long first = 0, second = 1, sum;

        for (int i = 1; i < input1; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return first;
    }
//     Another Solution of this problem
     static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
//     Solution 2
    int factorial(int n)
    {
 
        // single line to find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }
}
