package lv1;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        Solution5 solution = new Solution5();
        int result = solution.solution(num1, num2);

        System.out.println(result);

    }
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
            return answer;
        }
        return -1;
    }
}