package lv1;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int angle = scanner.nextInt();

        Solution8 solution = new Solution8();
        int result = solution.solution(angle);

        System.out.println(result);

    }
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}