function solution(food) {
  let food_array = "";

  food = food.map((food) => {
    return Math.floor(food / 2);
  });

  for (let i in food) {
    for (let x = 0; x < food[i]; x++) {
      food_array += i;
    }
  }

  return food_array + 0 + food_array.split("").reverse().join("");
}
