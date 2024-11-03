// without generics
function add(a: number, b: number) {
  return a + b;
}
add(1, 2);
function add1(a: any, b: any) {
  return a + b;
}
add1(1, 2);

// with generics
function funG1<T>(argG1: T): T { // it input T type parameter then return T type parameter
  return argG1;
}

function funG2<S, U>(argG2: S, argG3: U): S { // it input S and U type parameter then return S type parameter
  return argG2;
}

console.log(funG1<number>(1));
console.log(funG1<string>("TypeScript"));
console.log(funG2<number, string>(1, "TypeScript"));
console.log(funG2("TypeScript", 1));

interface argGenContrasint {
  length: number;
}
function panjang<T extends argGenContrasint>(arg: T): T {
  return arg;
}
let result1 = panjang({ length: 10 });
let result2 = panjang({ length: 10, name: "Zaky" });
console.log(result1, result2);

// T, U, K, V and R for generic function, it can be any letter
// T: First type of function argument
// U: Second type of function argument
// K: Key of object argument
// V: Value of object argument
// R: Return type of function
