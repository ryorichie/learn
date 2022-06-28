#![allow(unused_doc_comments)]
#[allow(unused_imports)]
#[allow(unused_variables)]

use core::prelude::v1;
use std::vec;

fn main() {
    /// Vector
    // Creating new empty vector
    let v: Vec<i32> = Vec::new();

    // Let vec using default integer type
    let v = vec![1, 2, 3];
    let s = vec![1, 2, 3]; //you can create vector like this
                           // vec!, macro that create new vector that holds the value you give it

    // Updating vector
    let mut v = Vec::new(); // Making the v mutable
    v.push(5); // code above actually clear v value
    v.push(6);
    v.push(7);
    v.push(8);

    // Dropping a Vector
    {
        let v = vec![1, 2, 3, 4];
        // do stuff with v here
    } // v out of scope

    // Reading Elements of Vectors with index
    let mut v = vec![20, 12, 30, 9, 44];
    let third: &i32 = &v[2]; // Using indexing way, program will panic if index more than len
    println!("The third element is {}", third);

    // Reading Element with get
    match v.get(2) {
        // Using get method, program won't panic
        Some(third) => println!("The third element is {}", third),
        None => println!("There is no third element"),
    }

    // Attempting access nonexistance index
    // let does_not_exist = &v[100]; // panicked
    let does_not_exist = v.get(100); // not pannick

    // Attempting to add element to vector while holding reference to an item
    let first = &v[0];
    // v.push(5); // mutable reference conflict
    println!("The first element is: {}", first); // &v not dropped because of this

    // Iterating values in vector
    for i in &v {
        println!("{}", i);
    }
    for i in &mut v {
        *i += 50; // using deference operator to change value
    }

    // Using Enum to Store Multiple Types
    enum SpreadsheetCell {
        Int(i32),
        Float(f64),
        Text(String),
    }

    let row = vec![
        SpreadsheetCell::Int(3),
        SpreadsheetCell::Text(String::from("blue")),
        SpreadsheetCell::Float(10.12),
    ]

}
