/**
 * Why do we need Promise, Async/Await in JavaScript?
 *
 * In JavaScript, when we make a request to a server or perform an I/O operation, it takes some time to complete.
 * If we wrote our code synchronously, it would block the execution of the code until the operation is complete.
 * This is not ideal, as it would make our code unresponsive and slow.
 *
 * To solve this problem, we use callbacks. A callback is a function that is passed as an argument to another function,
 * and is executed after the operation is complete. This allows our code to continue executing without blocking.
 *
 * However, callbacks can lead to "callback hell", where we have multiple nested callbacks that make our code hard to read and maintain.
 *
 * Promises and Async/Await are solutions to this problem. A Promise is an object that represents the eventual completion (or failure) of an asynchronous operation.
 * It allows us to write asynchronous code that is easier to read and maintain, as it allows us to write code that looks synchronous, but is actually asynchronous.
 *
 * Async/Await is a syntax sugar on top of Promises, which makes it even easier to write asynchronous code.
 * It allows us to write code that looks synchronous, but is actually asynchronous.
 */

function getRandomNumber(max: number): number {
  return Math.floor(Math.random() * Math.floor(max));
}

let p = new Promise((resolve, reject) => {
  let result = getRandomNumber(10);
  if (result < 5) {
    resolve(result);
  } else {
    reject(result);
  }
});

console.log(p);

p.catch((erre) => console.log("ERRORS - ", erre));

// Promise chaining
let s = new Promise((resolve, reject) => {
  let result = getRandomNumber(10);
  if (result < 5) {
    resolve(result);
  } else {
    reject(result);
  }
});

s.then((result) => {
  console.log(result);
  return result * 2;
}).then((result) => {
  console.log(result);
  return result * 2;
});

console.log(s);
s.catch((erre) => console.log("ERROR - ", erre));
