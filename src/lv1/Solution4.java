package lv1;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        Solution4 solution = new Solution4();
        int result = solution.solution(age);

        System.out.println(result);

    }
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}