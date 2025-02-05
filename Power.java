package LEETCODE;

public class Power {
    public static double Solution(double x, int n) {
        long BinaryForm = n;
        if (n < 0) {
            x = 1 / x;
            BinaryForm = -BinaryForm;
        }
        double ans = 1;
        while (BinaryForm > 0) {
            if (BinaryForm % 2 == 1) {
                ans *= x;
            }
            x *= x;
            BinaryForm /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x = 2;
        int n = 5;
        System.out.println(Solution(x, n));
    }
}
