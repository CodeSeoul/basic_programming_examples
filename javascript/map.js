var list = [1, 2, 3, 4];
console.log(list);

function addOne(number) {
  return number + 1;
}

list = list.map(addOne);
console.log(list);
