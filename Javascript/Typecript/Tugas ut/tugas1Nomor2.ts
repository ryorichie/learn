const NIM = '044213394';
const startNumber = +NIM.slice(-2);

if (startNumber <= 20) {
  if (startNumber % 2 === 0 && startNumber < 20) {
    let i = startNumber;
    do {
      console.log(i);
      i += 1;
    } while (i <= 20);
  } else if (startNumber % 2 === 1 && startNumber < 20) {
    let i = startNumber;
    while (i <= 20) {
      console.log(i);
      i += 1;
    }
  }
} else {
  console.log("Number exceed max loop"); // Because last number of NIM is greater than 20 i add this
}
