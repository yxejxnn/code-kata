package lv1;

public class Solution17 {
    public static void main(String[] args) {

    }
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}
