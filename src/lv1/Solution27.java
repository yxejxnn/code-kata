package lv1;

public class Solution27 {
    public String solution(String phone_number) {
        String back = phone_number.substring(phone_number.length() - 4);
        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }

        answer += back;
        return answer;
    }
}
