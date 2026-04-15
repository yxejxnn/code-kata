package lv1;

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Solution14 solution = new Solution14();
        System.out.println(solution.solution(n));

    }
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
