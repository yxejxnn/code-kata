package lv2;

public class Solution40 {
    public int solution(int n) {
        String t = "";

        while (n != 0) {
            t += String.valueOf(n % 3);
            n = n / 3;
        }

        int answer = 0;

        for (int i = 0; i < t.length(); i++) {
            answer += Character.getNumericValue(t.charAt(i)) * (int) Math.pow(3, i);
        }

        return answer;
    }
}
