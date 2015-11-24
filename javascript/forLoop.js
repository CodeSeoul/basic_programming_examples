var arr = [1, 2, 3];

var func = function(a) { return a*2; };

function processArray(pArr, pFunc) {
  for ( var i = 0; i < pArr.length; i++ ) {
    pArr[i] = pFunc(arr[i]);
  }
  return pArr;
}

var output = processArray(arr, func);

console.log("arr: " + arr);
console.log("output: " + output);
