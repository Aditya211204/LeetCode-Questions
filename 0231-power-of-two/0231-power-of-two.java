class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false; // Negative numbers or 0 can't be powers of 2
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1; // True only if completely divided down to 1
    }
}
