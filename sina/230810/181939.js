function solution(a, b) {
  return "".concat(a, b) > "".concat(b, a)
    ? Number("".concat(a, b))
    : Number("".concat(b, a));
}
