package lv3;

public class Solution44 {
    public int solution(int[][] sizes) {

        int maxLong = 0;
        int maxShort = 0;

        for (int[] size : sizes) {
            int w = size[0]; // 가로길이
            int h = size[1]; // 세로길이

            int long_side = Math.max(w, h);
            int short_side = Math.min(w, h);

            maxLong = Math.max(maxLong, long_side);
            maxShort = Math.max(maxShort, short_side);
        }

        return maxLong * maxShort;
    }
}
