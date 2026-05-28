package lv3;

public class Solution45 {
    public String solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(' ');
            } else if (c >= 'a' && c <= 'z') {
                answer.append((char) ('a' + (c - 'a' + n) % 26));
            } else {
                answer.append((char) ('A' + (c - 'A' + n) % 26));
            }
        }

        return answer.toString();
    }
}
