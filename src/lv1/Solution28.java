package lv1;

public class Solution28 {
    public int soulution(int[] numbers) {
        int answer = 45;
        for (int n : numbers) {
            answer -= n;
        }
        return answer;
    }
}
