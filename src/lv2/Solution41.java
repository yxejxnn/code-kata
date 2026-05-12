package lv2;

public class Solution41 {
    public String solution(String s) {
        String[] words = s.split(" ");
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(word.charAt(j))); // 짝수 인덱스 -> 대문자
                } else {
                    sb.append(Character.toLowerCase(word.charAt(j))); // 홀수 인덱스 -> 소문자
                }
            }

            answer.append(sb);
            if (i < words.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
