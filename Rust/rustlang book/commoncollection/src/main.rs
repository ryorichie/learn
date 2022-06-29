#![allow(unused_doc_comments)]
#[allow(unused_imports)]
#[allow(unused_variables)]
#[allow(unused_mut)]
use core::prelude::v1;

fn main() {
    #![allow(unused_variables)]
    #![allow(unused_mut)]

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
    ];


    /// Storicng UTF-8 Encoded Text with String
    // Creating empty new String
    let mut s = String::new();
    let data = "initial contents";
    let s = data.to_string(); // converting data to string
    let s = "initial contents".to_string(); // same as above
    let s = String::from("Initial contents");

    // Updating String
    let mut up = String::from("foo");
    up.push_str("bar"); // takes sring slice
    // .push_str don't take ownership
    let mut s1 = String::from("foo");
    let s2 = "bar;";
    s1.push_str(s2);
    println!("s2 is {}", s2);
    // Adding character
    let mut lol = String::from("lo");
    lol.push('l');
    // Concat with + Operator or the format! macro
    let s11 = String::from("Hello, ");
    let s12 = String::from("world!");
    let s3 = s11 + &s12; //s11 no longger valid
    // this what happen and why we borrow s11
    // fn add(self, s: &str) -> String {
    // Using format
    let s21 = String::from("tic");
    let s22 = String::from("tac");
    let s23 = String::from("toe");
    let s = format!("{}-{}-{}", s1, s2, s3); // s21 will still valid with this
    // let ss = s21 + "-" + &s22 + "-" + &s23;

    // Indexing into String
    // rust string doesn't support indexing
    let s1 = String::from("hello");
    // let h = s1[0];
    /** Internal Representation */
    let hello = String::from("hola"); // take 1 byte per char
    let hellorus = String::from("Здравствуйте"); // take 2 byte per char
    // let answer = &hellorus[0]; // this confussion maker ust don't support indexing

    /** 
     * [224, 164, 168, 224, 164, 174, 224, 164, 184, 224, 165, 141, 
     * 224, 164, 164, 224, 165, 135] <- string as a byte
     * ['न', 'म', 'स', '्', 'त', 'े'] <- string as scalar values
     * ["न", "म", "स्", "ते"] <- string as Grapheme Cluster
     */  let hellohindi = String::from("नमस्ते");

    // Slicing String
        // let hellojapan = "おはようございます";
        // let s = &hellojapan[0..4];

    // Methods for Iterating Over Strings
    // using chars method to return scalar valus
    for c in "नमस्ते".chars() {
        println!("{}", c);
    }
    for c in "नमस्ते".bytes() {
        println!("{}", c);
    } // scalar value provided in crates.io
}
