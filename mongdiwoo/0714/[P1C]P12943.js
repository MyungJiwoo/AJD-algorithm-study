function solution(num) {
    let answer = 0;

    // 결과로 나온 수에 같은 작업을 1이 될 때까지 반복
    while (num != 1) {
        // 작업이 500번 초과하면 -1 반환
        if (answer > 500) return -1;

        // 입력된 수가 짝수라면 2로 나누기
        if (num % 2 == 0) num /= 2;
        // 입력된 수가 홀수라면 3을 곱하고 1을 더함
        else num = num * 3 + 1;

        answer++;
    }
    return answer;
}

console.log(solution(626331));

// P12943: 콜라츠 추측
