package lv2;

import java.util.Arrays;

public class Solution34 {
    public String solution(String s) {

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        String answer = new StringBuilder(new String(arr)).reverse().toString();

        return answer;
    }
}
