package lv1;

public class Solution10 {
    public static void main(String[] args) {

        Solution10 solution = new Solution10();

        // 테스트 케이스 1
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution.solution(numbers1));

        //테스트 케이스 2
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution.solution(numbers2));
    }
    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers) {
            answer += num;
        }
        answer /= numbers.length;
        return answer;
    }
}