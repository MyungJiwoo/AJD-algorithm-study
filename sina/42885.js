function solution(people, limit) {
  var answer = 0;
  people.sort((a, b) => b - a);

  let rt = people.length - 1;
  let lt = 0;

  while (lt < rt) {
    if (people[lt] + people[rt] > limit) lt++;
    else {
      rt--;
      lt++;
    }
    answer++;
  }
  if (lt === rt) answer++;
  return answer;
}
