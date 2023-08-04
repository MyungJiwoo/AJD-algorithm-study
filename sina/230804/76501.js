function solution(absolutes, signs) {
  let number = 0;
  let sum = 0;
  for (let i in signs) {
    absolutes[i] = signs[i] > 0 ? absolutes[i] : absolutes[i] * -1;
  }
  for (let i of absolutes) {
    sum += i;
  }
  return sum;
}
