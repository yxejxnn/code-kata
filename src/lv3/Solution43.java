package lv3;

public class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        long pNum = Long.parseLong(p);

        for (int i = 0; i <= t.length() - pLen; i++) {
            String sub = t.substring(i, i + pLen);
            long subNum = Long.parseLong(sub);

            if (subNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}
