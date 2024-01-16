//n	result
//4	5
//3	3
// 한번에 1칸 or 2칸 이동 가능. 경우의 수 구하기. 다이나믹 프로그래밍으로 접근할까
// 1 = 1, 2 = 2, 3 = 3, 4 = 5

// 다이나믹 프로그래밍 접근 방법 지금까지 경험으로 2개 -
// 1. 앞의 결괏값을 이용해서 일차원 배열로 점화식을 만들어내 표현.
// 2. 끝까지 가는 횟수가 정해져 있다면 (백준 1309와 같이), 누적값을 점화식으로 표현해서 작성.


//피보나치 수열
// 1실행시 계속 ArrayIndexOutOfBoundsException 오류
class Solution {
    public long solution(int n) {
        long[] array = new long[n + 1];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i <= n; i++) {
            array[i] = (array[i - 2] + array[i - 1]) % 1234567;
        }


        return (array[n-1]) % 1234567;
    }
}

public class P12914 {
}
