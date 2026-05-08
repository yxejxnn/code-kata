package lv2;

public class Solution39 {
    public int[] solution(int n, int m) {

        int[] answer = new int[2];
        int a = n;
        int b = m;

        while (m != 0) {
            int t = n % m;
            n = m;
            m = t;
        }

        answer[0] = n;
        answer[1] = a * b / n;

        return answer;
    }
}
