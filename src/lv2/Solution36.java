package lv2;

public class Solution36 {
    public boolean solution(String s) {

        boolean answer = true;

        if (s.length() == 4 || 6 == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }
}
