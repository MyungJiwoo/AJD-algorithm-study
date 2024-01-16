function solution(k, score) {
    var answer = [];
    let award = []; // 명예의 전당

    award.push(score[0]);
    answer.push(score[0]);

    for (let i = 1; i < score.length; i++) {
        if (award[award.length - 1] <= score[i] || award.length < k) {
            award.push(score[i]);
            award.sort((a, b) => b - a);

            if (award.length > k) {
                award.pop();
            }
        }

        answer.push(award[award.length - 1]);
    }

    return answer;
}

console.log(solution(3, [100, 30, 40, 150, 300, 200, 200]));

// P138477: 명예의 전당 (1)
