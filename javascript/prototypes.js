var roflCopters = function() {
  return "rofl";
}

var DNA = function() {
  this.toRNA = function(sequence) {
    return 'lol'; //stuff
  }; // should definitely work

  this.roflCopters = roflCopters; // should work...?
};

myDNA = new DNA();
newSequence = myDNA.toRNA('atgc');
console.log("newSequence: " + newSequence);
console.log("rofleCopters: " + myDNA.roflCopters());
