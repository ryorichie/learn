class Person {
  name: string;
  age: number;
  isMarried: boolean;

  constructor(name: string, age: number, isMarried: boolean) {
    this.name = name;
    this.age = age;
    this.isMarried = isMarried;
  }
}

class Salesman extends Person {
  sales: number;
  npp: number;
  salary: number;
  static taxrate: number = 10;
  constructor(
    name: string,
    age: number,
    isMarried: boolean,
    sales: number,
    npp: number,
    salary: number,
  ) {
    super(name, age, isMarried);
    this.sales = sales;
    this.npp = npp;
    this.salary = salary;
  }

  getSalary() {
    return this.salary;
  }

  setSalary(newSalary: number) {
    this.salary = newSalary;
  }

  getTax() {
    return this.salary * Salesman.taxrate / 100;
  }

  attendanceRecord() {
    let dateTime = new Date();
    console.log(
      "Attendance Recorded at " + dateTime.toLocaleDateString() + " - " +
        dateTime.toDateString(),
    );
  }
}

let Bambang = new Salesman("Bambang", 20, false, 10, 10, 1000000);
console.log(Bambang);
console.log(Bambang.getSalary());
Bambang.setSalary(2000000);
console.log(Bambang.getSalary());
console.log(Bambang.getTax());
Bambang.attendanceRecord();
