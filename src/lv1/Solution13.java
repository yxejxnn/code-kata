package lv1;

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Solution13 solution = new Solution13();
        System.out.println(solution.solution(n));

    }
    public int solution(int n) {
        int answer = 0;
        while (0 < n) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
