#[allow(non_snake_case)]
#[allow(unused_variables)]
#[allow(dead_code)]
fn main() {
    let numberlist = vec![12, 117, 123, 213, 111, 91, 234];
    let charList = vec!['G', 'A', 'K', 'L', 'E', 'M'];

    // Using function
    let result = largestold(&numberlist);
    println!("The largest number is {}", result);

    // Using multiple function
    let result_i32 = largest_i32(&numberlist);
    println!("The largest i32 number is {}", result_i32);
    let result_char = largest_char(&charList);
    println!("The largest char number is {}", result_char);

    // Using generic data type

    // Generic Types in Struct
    let integer = Point { x: 5, y: 10 };
    let float = Point { x: 2.5, y: 3.3 };
    // let wontWork = Point { x: 2, y: 20.5 };

    // Double generic type
    let justinteger = Doublepoint { x: 5, y: 10 };
    let justfloat = Doublepoint { x: 2.5, y: 3.3 };
    let floateger = Doublepoint { x: 2, y: 20.5 };

    // Example
    let p1 = Pointexample {x: 5, y: 10.5};
    let p2 = Pointexample {x: "Halo", y: 'H'};

    let p3 = p1.mixup(p2);
    println!("p3.x = {}, p3.y = {}", p3.x, p3.y)
}

fn largestold(list: &[i32]) -> i32 {
    let mut largest = list[0];

    for &item in list {
        if item > largest {
            largest = item;
        }
    }

    largest
}

fn largest_i32(list: &[i32]) -> i32 {
    let mut largest = list[0];

    for &item in list {
        if item > largest {
            largest = item;
        }
    }

    largest
}

fn largest_char(list: &[char]) -> char {
    let mut largest = list[0];

    for &item in list {
        if item > largest {
            largest = item;
        }
    }

    largest
}

// fn largestNew<T>(list: &[T]) -> T {
//     let mut largest = list[0];

//     for &item in list {
//         if item > largest {
//             largest = item;
//         }
//     }

//     largest
// }

// Generic Types in struct
struct Point<T> {
    x: T,
    y: T,
}
struct Doublepoint<T,U> {
    x: T,
    y: U,
}
enum Option<T> { // now it make sense
    Some(T),
    None,
}
enum Result<T, E> { // Multiple Generic Type Enum
    Some(T),
    Err(E),
}

// Generic Types In Method
impl<T> Point<T> {
    fn x(&self) -> &T {
        &self.x
    }
}
// Constraint generic type
impl Point<f32> {
    fn distance_from_origin(&self) -> f32 {
        (self.x.powi(2) + self.y.powi(2)).sqrt()
    }
}

// Example
struct Pointexample<X1, Y1> {
    x: X1,
    y: Y1,
}
impl <X1,Y1> Pointexample<X1, Y1> {
    fn mixup<X2, Y2> (self, other: Pointexample<X2, Y2>) -> Pointexample<X1, Y2> {
        Pointexample { x: self.x, y: other.y,}
    }
}