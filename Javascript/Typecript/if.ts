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
