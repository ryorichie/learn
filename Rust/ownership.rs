///** Ownership rule */
/// Each value in Rust has a variable that's called its owner
/// There can only be one owner at a time
/// When the owner goes out of scope, the value will be dropped


//** Variable Scope */
fn main() {
    {                      // s is not valid here, it’s not yet declared
        let s = "hello";   // s is valid from this point forward

        // do stuff with s
    }                      // this scope is now over, and s is no longer valid
}


//** String Type */
// String::from
fn main() {
    let mut s = String::from("hello"); 
    // The double colon :: operator allows us
    // to namespace this particular from function under the String type

    // String type manages data allocated on the heap and can stone an
    // amount of the text that is uknown to us at compile time

    s.push_str(", worlds!");

    println!("{}", s);
}

//** Move */
fn main() {
    let x = 5;
    let y = x;
}

fn main() {
    let s1 = String::from("hello");
    let s2 = s1; // isn't copy but move

    println!("{}, world!", s1);
}
/**
 * This is what happen
2 |     let s1 = String::from("hello");
  |         -- move occurs because `s1` has type `String`, which does not implement the `Copy` trait
3 |     let s2 = s1;
  |              -- value moved here
4 | 
5 |     println!("{}, world!", s1);
  |                            ^^ value borrowed here after move
 */

//** Clone */
fn main() {
    let s1 = String::from("hello");
    let s2 = s1.clone(); // this doesn't move s1 value to s2

    println!("s1 = {}. s2 = {}", s1, s2);
}


//** Copy */
fn main() {
    let x = 5;
    let y = x;

    println!("x = {}, y = {}", x, y);
}


//** Ownership and Functions */
fn main() {
    let s = String::from("hello");  // s comes into scope

    takes_ownership(s);             // s's value moves into the function...
                                    // ... and so is no longer valid here
    
    let x = 5;                      // x comes into scope

    makes_copy(x);                  // x would move into the function,
                                    // but i32 is Copy, so it's okay to still
                                    // use x afterward

} // Here, x goes out of scope, then s. But because s's value was moved, nothing
  // special happens.

fn takes_ownership(some_string: String) { // some_string comes into scope
    println!("{}", some_string);
} // Here, some_string goes out of scope and `drop` is called. The backing
  // memory is freed.

fn makes_copy(some_integer: i32) { // some_integer comes into scope
    println!("{}", some_integer);
} // Here, some_integer goes out of scope. Nothing special happens.


//** Ownership and Functions */
fn main() {
    let s1 = gives_ownership();         // gives_ownership moves its return
                                        // value into s1

    let s2 = String::from("hello");     // s2 comes into scope

    let s3 = takes_and_gives_back(s2);  // s2 is moved into
                                        // takes_and_gives_back, which also
                                        // moves its return value into s3
    // println!("{}", s2); can't work here, because s2 move
} // Here, s3 goes out of scope and is dropped. s2 was moved, so nothing
  // happens. s1 goes out of scope and is dropped.

fn gives_ownership() -> String {             // gives_ownership will move its
                                             // return value into the function
                                             // that calls it

    let some_string = String::from("yours"); // some_string comes into scope

    some_string                              // some_string is returned and
                                             // moves out to the calling
                                             // function
}

// This function takes a String and returns one
fn takes_and_gives_back(a_string: String) -> String { // a_string comes into
                                                      // scope

    a_string  // a_string is returned and moves out to the calling function
}


// rust let us return multiple values using a tuple
fn main() {
    let s1 = String::from("hello");

    let (s2, len) = calculate_length(s1);

    println!("The length of '{}' is {}.", s2, len);
}

fn calculate_length(s: String) -> (String, usize) {
    let length = s.len(); // len() returns the length of a String

    (s, length)
}


//** References and Borrowings */
fn main() {
    let s1 = String::from("hello");

    let len = calculate_length(&s1);

    println!("The length of '{}' is {}.", s1, len);
}

fn calculate_length(s: &String) -> usize { // s is a reference to a String
    s.len()
} // Here, s goes out of scope. But because it does not have ownership of what
  // it refers to, nothing happens.


  /** Try to modify a borrowed value */
  fn main() {
    let s = String::from("hello");

    change(&s);
}

fn change(some_string: &String) {
    some_string.push_str(", world");
}

/** Mutable Reference */
fn main() {
    let mut s = String::from("hello");

    change(&mut s); /** It change s value */
    println!("{}", s);
}

fn change(some_string: &mut String) {
    some_string.push_str(", world");
}

/** Mutable references have one big restriction:
 * you can have only one mutable reference to a
 * particular piece of data at a time */
 fn main() {
    let mut s = String::from("hello");

    let r1 = &mut s;
    let r2 = &mut s;

    println!("{}, {}", r1, r2);
}
