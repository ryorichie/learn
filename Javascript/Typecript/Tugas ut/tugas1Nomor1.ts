for (let i = 0; i < 10; i++) {
  let sum = 0;
  const isEvenRow = (i + 1) % 2 === 0;
  
  for (let j = 1; j <= 10; j++) {
    const num = i * 10 + j;
    if (num % 2 === (isEvenRow ? 0 : 1)) {
      console.log(num);
      sum += num;
    }
  }
  
  console.log("Jumlah:" + sum);
}