#![allow(unused_doc_comments)]
#[allow(unused_imports)]
#[allow(unused_variables)]
#[allow(unused_mut)]
use core::prelude::v1;
use std::{collections::HashMap, vec};
use unicode_segmentation::UnicodeSegmentation;

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
    // Getting specific varian value
    match &row[1] {
        &SpreadsheetCell::Int(i) => println!("{}", i),
        _ => println!("Not a integer"),
    }


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
     * Bytes
     * [224, 164, 168, 224, 164, 174, 224, 164, 184, 224, 165, 141, 224, 164, 164, 224, 165, 135]
     * Scalar Value
     * ['न', 'म', 'स', '्', 'त', 'े']
     * Grapheme Cluster
     * ["न", "म", "स्", "ते"]
     */  let hellohindi = String::from("नमस्ते");

    // Slicing String
        let hellojapan = String::from("おはようございます、昨夜");
        // let s = &hellojapan[0..4];

    // Methods for Iterating Over Strings
    for c in hellohindi.bytes() { // Bytes Value
        println!("{}", c);
    } 
    for c in hellohindi.chars() { // Scalar Value
        println!("{}", c);
    } // scalar value provided in crates.io
    for c in hellohindi.graphemes(true) {
        println!("{}", c);
    }

    /// Hash Map
    let mut scores = HashMap::new();
    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Yellow"), 50);
    // Collect Method
    let teams = vec![String::from("Blue"), String::from("Yellow")];
    let initial_scores = vec![10, 50];
    let mut scores1: HashMap<_, _> = 
        teams.into_iter().zip(initial_scores.into_iter()).collect();
    // Hash Maps and Ownership
    let field_name = String::from("Favorite color");
    let field_value = String::from("Blue");
    let mut map = HashMap::new();
    map.insert(field_name, field_value);
    /** We can't use field value here */
    // Accessing Values in Hash Map with get mehod
    let team_name = String::from("Blue");
    let score = scores.get(&team_name);
    // for loop hashmap
    for (key, value) in &scores {
        println!("{}, {}", key, value);
    }


    // Updating hashmap
    // Overwriting value
    scores.insert(String::from("Blue"), 10);
    scores.insert(String::from("Blue"), 25); // value above drop
    println!("{:?}", scores);
    // Only inserting a value if the key has no value
    scores.entry(String::from("Yellow")).or_insert(50);
    scores.entry(String::from("Blue")).or_insert(50);
    // Updating Value Basen on the Old Value
    let text = "hello world wonderful world";
    let mut map1 = HashMap::new();
    for word in text.split_whitespace() {
        let count = map1.entry(word). or_insert(0); // or_insert return mutable reference of value (not key)
        *count += 1;//dereference value and add hashmap value
        println!("{:?}", map1);
    }

    // Biar paham
    let mut mapcoba = HashMap::new();
    let mut sanga = String::from("haha");
    let coba = mapcoba.entry(sanga).or_insert(0);
    *coba += 1;
    *coba += 1;
    println!("{:?}", coba);
    println!("{:?}", mapcoba);
}
