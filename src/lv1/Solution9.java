package lv1;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Solution9 solution = new Solution9();
        int result = solution.solution(n);

        System.out.println(result);
    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}