function solution(number, limit, power) {
  const number_array = [];
  let weapon_power = 0;
  let index = 1;
  for (let x = 1; x <= number; x++) {
    let current_number = x;
    let num = 0;
    for (let y = 1; y * y <= current_number; y++) {
      if (y * y === current_number) {
        num++;
      } else if (current_number % y === 0) {
        num += 2;
      }
    }
    number_array.push(num);
  }
  for (let i of number_array) {
    if (i <= limit) {
      weapon_power += i;
    } else {
      weapon_power += power;
    }
  }
  return weapon_power;
}
