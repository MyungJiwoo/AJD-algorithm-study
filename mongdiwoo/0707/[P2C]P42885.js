function solution(people, limit) {
    var answer = 0;

    // 몸무게가 제일 적은 사람과 제일 많은 사람 비교를 위해 오름차순 정렬
    people.sort((a, b) => a - b);

    while (people.length > 0) {
        if (people[0] + people[people.length - 1] <= limit) {
            people.shift();
        }
        people.pop();

        answer++;
    }

    return answer;
}

console.log(solution([70, 80, 50], 100));

// P42885: 구명보트
// 몸무게 배열 => people
// 무게 제한 => limit
