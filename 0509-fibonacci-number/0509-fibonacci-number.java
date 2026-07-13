class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        int ft = 0;  // first term
        int st = 1;  // second term

        for (int i = 2; i <= n; i++) {
            int tt = ft + st;  // next term
            ft = st;
            st = tt;
        }
        return st; // return the nth Fibonacci number
    }
}
