package lv1;

import java.util.Arrays;
import java.util.Collections;

public class Solution20 {
    public static void main(String[] args) {

    }
    public long solution(long n) {
        String[] arrs = String.valueOf(n).split("");

        Arrays.sort(arrs, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String arr : arrs) {
            sb.append(arr);
        }

        return Long.parseLong(sb.toString());
    }
}
