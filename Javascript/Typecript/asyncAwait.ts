/**
 * Async/Await is a syntax sugar on top of Promises, which makes it even easier to write asynchronous code.
 * It allows us to write code that looks synchronous, but is actually asynchronous.
 *
 * The `async` keyword is used to define an asynchronous function, which returns a Promise.
 * The `await` keyword is used to pause the execution of an asynchronous function until a Promise is resolved or rejected.
 * If the Promise is resolved, the value resolved from the Promise is returned from the `await` expression.
 * If the Promise is rejected, the `await` expression throws the rejected value.
 *
 * The benefits of using Async/Await are:
 * - It makes the code look synchronous, which is easier to read and maintain.
 * - It eliminates the need for callbacks and chained `.then()` methods.
 * - It allows us to use try-catch blocks to handle errors in a more synchronous way.
 */

function getRandomNumber(max: number): number {
  return Math.floor(Math.random() * Math.floor(max));
}


function moreThan(max: number, angka: number): boolean | number {
  if (angka > max) {
    throw "ERR: arg 1 harus lebih besar dari arg 2";
  }
  let Random = getRandomNumber(max);
  if (Random > angka) {
    return true;
  } else {
    return Random;
  }
}

let p = async function (): Promise<boolean | number> {
  try {
    let result = await moreThan(10, 5);
    // let result = await moreThan(1, 5);
    return result;
  } catch (error) {
    return error;
  }
};

(async () => {
  console.log(await p());
})();

// Example using async/await
async function fetchDataAsync() {
  try {
    let response = await fetch('https://jsonplaceholder.typicode.com/todos/1');
    let data = await response.json();
    console.log('Data fetched successfully:', data);
  } catch (error) {
    console.error('Error fetching data:', error);
  }
}

// Call the async function
fetchDataAsync();

// Example without async/await
function fetchDataWithoutAsync() {
  let response = fetch('https://jsonplaceholder.typicode.com/todos/1');
  // This will fail because response is a Promise, not the resolved value
  console.log('Data fetched:', response);
}

// Call the function without async/await
fetchDataWithoutAsync();

