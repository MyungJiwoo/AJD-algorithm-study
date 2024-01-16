function solution(my_string, overwrite_string, s) {
  const replace_str_first = my_string.slice(0, s);
  console.log(replace_str_first);
  const replace_str_last = my_string.slice(
    replace_str_first.length + overwrite_string.length,
    my_string.length
  );
  console.log(replace_str_last);
  return replace_str_first + overwrite_string + replace_str_last;
}
