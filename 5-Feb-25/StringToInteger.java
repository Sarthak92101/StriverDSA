package LEETCODE;

public class StringToInteger {

    public static int Solution(String s) {
        if (s == null || s.isEmpty())
            return 0;

        s = s.trim();
        if (s.isEmpty())
            return 0;

        int sign = 1, index = 0, n = s.length();
        long result = 0;

        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            if (s.charAt(index) == '-') {
                sign = -1;
            } else {
                sign = 1;
            }

            index++;
        }

        while (index < n && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            if (sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            index++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        String s = "99";
        System.out.println(Solution(s));

    }
}
