function solution(k, m, score) {
    let answer = 0;

    // 과일 점수 내림차순 정렬
    score.sort((a, b) => b - a);

    // m개만큼 잘라서 포장
    let s = [];
    for (i = 0; i < score.length; i += m) s.push(score.slice(i, i + m));

    // 포장한 상자에서 최저점 * m으로 가격 정하기
    s.map((item) => {
        if (item.length >= m) answer += item.pop() * m;
    });

    return answer;
}

// P135808: 과일 장수
