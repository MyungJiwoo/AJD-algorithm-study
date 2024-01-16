function solution(k, m, score) {
  score.sort(function (a, b) {
    return b - a;
  });

  let index = 0;
  let appleBox = [];
  let appleBoxs = [];
  let appleBoxPrice = 0;

  for (let x = 0; x < score.length; x += m) {
    for (let y = 0; y < m; y++) {
      appleBox.push(score[index]);
      index++;
    }
    appleBoxs.push(appleBox);
    appleBox = [];
  }

  for (i of appleBoxs) {
    i.sort();
    if (!i.some((value) => value === undefined || null)) {
      appleBoxPrice += i[0] * m;
    }
  }

  return appleBoxPrice;
}
