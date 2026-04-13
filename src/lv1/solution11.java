package lv1;

import java.util.Scanner;

public class solution11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        solution11 solution = new solution11();

        System.out.println(solution.solution(num));
    }
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}