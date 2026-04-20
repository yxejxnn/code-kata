package lv1;

public class Solution19 {
    public static void main(String[] args) {

    }
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        if (x * x == n) {
            return (x + 1) * (x + 1);
        }
        return -1;
    }
}
