package lv1;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Solution2 solution = new Solution2();
        int result = solution.solution(num1, num2);

        System.out.println(result);

    }
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }
}