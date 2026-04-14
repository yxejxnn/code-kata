package lv1;

public class solution12 {
    public static void main(String[] args) {

        solution12 solution = new solution12();

        int[] arr1 = {1, 2, 3, 4};
        System.out.println(solution.solution(arr1));

        int[] arr2 = {5, 5};
        System.out.println(solution.solution(arr2));

    }
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer / arr.length;
    }
}
