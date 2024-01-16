function solution(num) {
  let number = 0;

  while (num !== 1) {
    num = num % 2 === 0 ? Math.floor(num / 2) : num * 3 + 1;
    number++;
    if (number > 500) {
      return -1;
    }
  }
  return number;
}
