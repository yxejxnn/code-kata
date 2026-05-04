package lv2;

public class Solution35 {
    public long solution(int price, int money, int count) {

        long answer = 0;
        int result = 0;

        for (int i = 1; i <= count; i++) {
            result += price * i;
        }

        if (money < result) {
            answer = result - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
