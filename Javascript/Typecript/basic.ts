// Boolean
let isFinished: boolean = false;
console.log(isFinished, typeof isFinished); // boolean

// Number
let price: number = 150.34;
console.log(price, typeof price); // number

// Number
let numOfEmployees: number = 25;
console.log(numOfEmployees, typeof numOfEmployees); // number

// String
let progLang: string = "TypeScript";
console.log(progLang, typeof progLang); // string

// Array of String
let university: string[] = ["UT", "UGM", "ITB"];
console.log(university, typeof university); // object

// Tuple
let employee: [number, string, boolean, number, string];
employee = [1, "Zaky Aditya", true, 20, "Engineer"];
console.log(employee, typeof employee); // object

// Enum
enum Color {
  Black = 2,
  Blue, // Have same value with green
  Yellow, // Value is 4
  Green = 3,
  Red = 3 * 3,
}
// {
//   "2": "Black",
//   "3": "Green",
//   "4": "Yellow",
//   "9": "Red",
//   Black: 2,
//   Blue: 3,
//   Yellow: 4,
//   Green: 3,
//   Red: 9
// }

console.log(Color, typeof Color); // object

// Union
let code: string | number;
code = "my code";
console.log(code, typeof code); // string
code = 21;
console.log(code, typeof code); // number

// Null
let valueNull = null;
console.log(valueNull, typeof valueNull); // object

// Undefined
let valueUndefined = undefined;
console.log(valueUndefined, typeof valueUndefined); // undefined

// Any
let valueAny: any;
console.log(valueAny, typeof valueAny); // undefined
valueAny = true;
console.log(valueAny, typeof valueAny); // boolean
valueAny = 42;
console.log(valueAny, typeof valueAny); // number
valueAny = [];
console.log(valueAny, typeof valueAny); // empty array
valueAny = {};
console.log(valueAny, typeof valueAny); // empty object
valueAny = Math.random;
console.log(valueAny, typeof valueAny); // function
valueAny = null;
console.log(valueAny, typeof valueAny); // object
valueAny = undefined;
console.log(valueAny, typeof valueAny); // undefined

// Unknown
let valueUnknown: unknown;
console.log(valueUnknown, typeof valueUnknown); // undefined
valueUnknown = true;
console.log(valueUnknown, typeof valueUnknown); // boolean
valueUnknown = 42;
console.log(valueUnknown, typeof valueUnknown); // number
valueUnknown = "TypeScript";
console.log(valueUnknown, typeof valueUnknown); // string
valueUnknown = [];
console.log(valueUnknown, typeof valueUnknown); // object
valueUnknown = {};
console.log(valueUnknown, typeof valueUnknown); // object
valueUnknown = Math.random;
console.log(valueUnknown, typeof valueUnknown); // function
valueUnknown = null;
console.log(valueUnknown, typeof valueUnknown); // object
valueUnknown = undefined;
console.log(valueUnknown, typeof valueUnknown); // undefined

var a = 10;
console.log(a);
// variable a can be reassigned
var a = 20; // <1>
console.log(a);
let b = 30;
console.log(b);
// variable b can be reassigned
b = b + 5; // <2>
console.log(b);
const c = "softwareku";
console.log(c);
// variable c can't be reassigned
