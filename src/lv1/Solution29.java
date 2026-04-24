package lv1;

public class Solution29 {
    public int[] solution(int[] arr) {
        // 1개면 [-1] 리턴
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 최솟값 찾기
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }

        // 최솟값 제외하고 새 배열 만들기
        int[] answer = new int[arr.length - 1];
        int i = 0;
        boolean removed = false;
        for (int n : arr) {
            if (n == min && removed == false) {
                removed = true;
            } else {
                answer[i] = n;
                i++;
            }
        }
        return answer;
    }
}
