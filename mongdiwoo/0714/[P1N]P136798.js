// 약수 개수 구하기 (제곱근 사용)
function countDivisor(num) {
    let count = 0;
    for (let i = 1; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            count++;
            if (num / i != i) count++;
        }
    }
    return count;
}

function solution(number, limit, power) {
    let answer = 0;
    let divisor = [];

    for (let i = 1; i <= number; i++) {
        {
            countDivisor(i) <= limit
                ? divisor.push(countDivisor(i))
                : divisor.push(power);
        }
    }

    console.log(divisor);

    for (let index of divisor) answer += index;

    return answer;
}

console.log(solution(10, 3, 2));

// P136798: 기사단원의 무기
