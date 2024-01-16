//[[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
class Solution {
    public int solution(int[][] sizes) {
        int max1 = 0;
        int max2 = 0;

        for (int i=0;i<sizes.length;i++){
            max1 = Math.max(Math.max(sizes[i][0],sizes[i][1]),max1); // 가장 큰 값
            max2 = Math.max(Math.min(sizes[i][0],sizes[i][1]),max2); // 각 배열마다 가장 작은 값들 중 가장 큰 값
        }
        return max1*max2;
    }
}

public class P86491 {
}
