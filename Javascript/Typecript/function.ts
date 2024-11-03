// Function Expression
function add(a: number, b: number): number {
  return a + b;
}
console.log(add(1, 2));

// Arrow Function
const add2 = (a: number, b: number): number => a + b;
console.log(add2(1, 2));

// Anonymous Function
const add3 = function (a: number, b: number): number {
  return a + b;
};
console.log(add3(1, 2));

// Void Function
const add4 = function (a: number, b: number): void {
  console.log(a + b);
};
console.log(add4(6, 2));

// Never Ending Function
// nonStop();
// function nonStop() {
//     while (true) {
//       console.log("Hello");
//     }
// }

// Anonymous Function
((str: string, idx: number) => console.log(str[idx]))("Hello", 1);
