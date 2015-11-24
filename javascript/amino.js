// Map for easy lookup
var aminoMap = {
  "a": "u",
  "c": "g",
  "t": "a",
  "g": "c"
};

// We could use a list directly, but we're gonna be fancy
//var sequence = ["a", "t", "c", "g", "t", "g", "c", "a"];
// Instead, we're going to use a string helper function
var sequence = "atcgtgca";

// our function that will be applied to each list member
function rnaSwap(letter) {
  return aminoMap[letter];
}

// SO FANCY
// we split the string into a list of each character
// then we map the rnaSwap -- it executes rnaSwap on each member
console.log(sequence.split('').map(rnaSwap));
