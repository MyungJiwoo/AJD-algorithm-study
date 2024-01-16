function solution(phone_number) {
  const number = phone_number.substring(0, phone_number.length - 4);
  const star = "*".repeat(number.length);
  return (
    star + phone_number.substring(phone_number.length - 4, phone_number.length)
  );
}
