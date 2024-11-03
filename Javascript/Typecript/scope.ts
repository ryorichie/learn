let scoping = function (input: any) {
  let x = 10; // x is just in this scope not outside and inside
  var y = 20; // y scope is inside only
  console.log(x);

  if (typeof input === "number") {
    // console.log(x); // out of scope
    console.log(y);
    let x = input + 10;
    console.log(x);
    var y = y + 10;
    console.log(y);
    return y;
  }
  return x;
};
console.log(scoping(10));

// console.log(x);  // out of scope
