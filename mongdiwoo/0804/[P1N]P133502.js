// 스택까진 접근했지만 그 이후를 너무 헤매다 (거의 일주일?) 인터넷 참고했습니다..ㅎ
// 시간 초과가 뜰까봐 문자열 메소드를 아예 쓰지 않아야겠다고 생각한게 실패 요인 같습니다,, 허허
// 맨 마지막 4개만 따오는건 시간 초과가 걸리지 않네용

function solution(ingredient) {
    let answer = 0;

    let hambugar = [];

    for (let i of ingredient) {
        hambugar.push(i);

        if (hambugar.length >= 4 && hambugar.slice(-4).join("") == "1231") {
            hambugar.pop();
            hambugar.pop();
            hambugar.pop();
            hambugar.pop();

            answer++;
        }
    }

    return answer;
}

// P133502: 햄버거 만들기
