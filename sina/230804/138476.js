//객체로 풀어야겠다는 생각은 했는데 도무지 못하겠어서 그냥 인터넷 봄
function solution(k, tangerine) {
  let object = {};
  tangerine.forEach((value) => {
    if (object[value]) {
      ++object[value];
    } else {
      object[value] = 1;
    }
  });

  let answer = 0;
  let sum = 0;
  let valueArray = Object.values(object).sort((a, b) => {
    return b - a;
  });
  for (let i = 0; i < valueArray.length; i++) {
    ++answer;
    if (sum + valueArray[i] >= k) {
      break;
    }
    sum += valueArray[i];
  }
  return answer;
}
