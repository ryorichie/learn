// If statement
let a: number = 21;
let b: number = 3;
let c: number = a / b;

if (c > 5) {
  console.log("lebih besar dari 5");
} else if (c > 3) {
  console.log("antar 3 - 5");
} else {
  console.log("di bawah 3");
}

// Switch
let hari: number = 5;
let hariStr: string;

switch (hari) {
  case 1:
    hariStr = "Senin";
    break;
  case 2:
    hariStr = "Selasa";
    break;
  case 3:
    hariStr = "Rabu";
    break;
  case 4:
    hariStr = "Kamis";
    break;
  case 5:
    hariStr = "Jumat";
    break;
  case 6:
    hariStr = "Sabtu";
    break;
  case 7:
    hariStr = "Minggu";
    break;
  default:
    hariStr = "Hari tidak valid";
    break;
}
console.log(hariStr);

// For Loop
for (let i = 0; i < 10; i++) {
  console.log("Looping ke" + i);
}
let arr = ["senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"];
for (var i of arr) {
  console.log(i);
}
for (var index in arr) {
  console.log(index);
}
console.log(index);
for (let index1 in arr) {
  console.log(index1);
}
// console.log(index1); // This will cause an error because index1 is only defined inside the scope of the for-in loop. When the loop is finished, index1 is no longer available.
let kalimat = "Hello World";
for (var letter of kalimat) {
  console.log(letter);
}

// While Loop
let wloop: number = 1;
while (wloop < 10) {
  console.log("Looping ke " + wloop);
  wloop++;
}

let wloop2: number = 5; // false while loop
while (wloop2 < 5) {
  console.log("Looping ke " + wloop2);
  wloop2--;
}

let wloop3: number = 5; // do while loop
do {
  console.log("Looping ke " + wloop3);
  wloop3--;
} while (wloop3 > -10);

let wloop4: number = 10; // do while loop do atleast once
do {
  console.log("Looping ke " + wloop4);
  wloop4--;
} while (wloop4 > 10);
