// Define an interface for a person with basic properties
interface Person {
  name: string;
  age: number;
  isMarried: boolean;
}

// Define a Salesman interface that extends Person and includes additional properties
interface Salesman extends Person {
  sales: number;
  npp: number; // Unique employee number
  salary: number;
}

// Create a Person object
let person: Person = {
  name: "Zaky",
  age: 20,
  isMarried: false,
  sales: 10, // Still works
  npp: 10,
  salary: 10,
};

// Create a Salesman object that also includes Person properties
let person2: Salesman = {
  name: "Zaky",
  age: 20,
  isMarried: false,
  sales: 10,
  npp: 10,
  salary: 10,
};

// Log the age of person and the entire Salesman object
console.log(person);
console.log(person.age);
console.log(person2);

// Define an interface for a dictionary-like object with string keys and values
interface DictList {
  [key: string]: string;
}

// Create an object that uses the DictList interface
let hewan: DictList = {};

// Add key-value pairs to the DictList object
hewan["air"] = "burung";
hewan["water"] = "ikan";

// Log specific value and the entire DictList object
console.log(hewan["air"]);
console.log(hewan);

// Define an interface for a scoring function that takes a number and a string
interface Scoring {
  (key: number, value: string): void;
}

// Implement a function that matches the Scoring interface
function adderScore(key: number, value: string): void {
  console.log("Adding", key, value);
}

// Implement another function that matches the Scoring interface
function updaterScore(key: number, value: string): void {
  console.log("Updating", key, value);
}

// Assign the adderScore function to a variable of type Scoring and call it
let addingScore: Scoring = adderScore;
addingScore(1, "Zaky");

// Assign the updaterScore function to a variable of type Scoring and call it
let updatingScore: Scoring = updaterScore;
updatingScore(1, "Zakaria");
