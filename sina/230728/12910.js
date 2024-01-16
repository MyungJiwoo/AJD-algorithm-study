function solution(arr, divisor) {
  var answer = [];
  for (let i of arr) {
    if (i % divisor === 0) {
      answer.push(i);
    }
  }
  if (answer.length === 0) {
    answer.push(-1);
  }
  return answer.sort((a, b) => {
    return a - b;
  });
}

//나는 배열 하나씩 일일히 돌아서 검사하고 저장했는데 Filter기능이 있더라 싱기싱기
//이걸 꼭 쓰자!
