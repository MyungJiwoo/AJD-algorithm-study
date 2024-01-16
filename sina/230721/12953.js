function solution(arr) {
  let num = 1;

  while (true) {
    if (
      arr.every((arrayNum) => {
        return num % arrayNum === 0;
      })
    ) {
      break;
    } else {
      num++;
    }
  }

  return num;

  //내가 했다가 안된거..흑흑흑
  // outer : while(true){
  //     for(let i of arr){
  //         if(num%i===0){
  //             if(i === arr[arr.length-1]){
  //                 break outer;
  //             }
  //             continue;
  //         }
  //         else{
  //             num++;
  //             break;
  //         }
  //     }
  // }
}
