function solution(ingredient) {
  let hamburgensis = 0;
  let stack = [];

  for (let i of ingredient) {
    stack.push(i);

    if (stack.slice(-4).join("") == "1231") {
      console.log(stack.splice(-4));
      hamburgensis++;
    }
  }

  return hamburgensis;
}
//이걸로 쓰려고 했는데 시간 초과나서 못풀었다. join이랑 replace가 생각보다 시간을 많이 잡아먹는다.
//위에서 구현한 방법은 스택으로 구현한 방법!
//스택을 다시 배울 필요가 있을거같다
/*
function solution(ingredient) {
    let hamburgensis = 0;
    
    ingredient = ingredient.join("");
    while(ingredient.includes("1231")){
        ingredient = ingredient.replace("1231","");
        hamburgensis++;
    }
    return hamburgensis;
}*/
