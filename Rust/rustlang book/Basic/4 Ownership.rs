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

    // String type manages data allocated on the heap and can store an
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
    println!("{}", s);
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


///** References and Borrowings */
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

    change(&mut s); //It change s value
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
    let r2 = &mut s; //Error

    println!("{}, {}", r1, r2);
}

// it's fine if you make scope of it
let mut s = String::from("hello");

{
    let r1 = &mut s;
} // r1 goes out of scope here, so we can make a new reference with no problems.

let r2 = &mut s;
/**Rust enforces a similar rule for combining mutable 
 * and immutable references. This code results in an error: */
fn main() {
    let mut s = String::from("hello");

    let r1 = &s; // no problem
    let r2 = &s; // no problem
    let r3 = &mut s; // BIG PROBLEM

    println!("{}, {}, and {}", r1, r2, r3);
}


// reference scope starts from it introduce and continue through the last time that references is used
fn main() {
    let mut s = String::from("hello");

    let r1 = &s; // no problem
    let r2 = &s; // no problem
    println!("{} and {}", r1, r2); 
    // variables r1 and r2 will not be used after this point

    let r3 = &mut s; // no problem
    println!("{}", r3);
}


//** Dangling References */
fn main() {
    let reference_to_nothing = dangle();
}

fn dangle() -> &String { // dangle returns a reference to a String

    let s = String::from("hello"); // s is a new String

    &s // we return a reference to the String, s
} // Here, s goes out of scope, and is dropped. Its memory goes away.
  // Danger!

  /** after dangle finished, s will be deallocated. when we tried to 
   * reference it, reference would be pointing to an invalid string
   */

//** Here's the solution. just return string directly */
fn main() {
    let string = no_dangle();
}

fn no_dangle() -> String {
    let s = String::from("hello");

    s
}

//** Reference Recap */
/**At any given time, you can have either one mutable 
 * reference or any number of immutable references.
 * References must always be valid. */


 ///** The Slice Type */
 /// Slices let you reference a contiguous sequence of elements 
 /// in a collection rather than the whole collection. A slice is
 /// a kind of reference, so it does not have ownership.
 
 //** Example */
 fn main() {
    let mut s = String::from("hello world");

    let word = first_word(&s); // word will get the value 5

    s.clear(); // this empties the String, making it equal to ""

    println!("{}", word);    // word still has the value 5 here, but there's no more string that
    // we could meaningfully use the value 5 with. word is now totally invalid!
}
 fn first_word(s: &String) -> usize {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return i;
        }
    }

    s.len()
}

fn second_word(s: &String) -> (usize, usize) {

}
//** String Slices */
// We create slices using a range within brackets by specifying [starting_index..ending_index]
fn main() {
    let s = String::from("hello world");

    let hello = &s[0..5];
    let world = &s[6..11];
}

/** With Rust’s .. range syntax, if you want to start at index zero, you can drop the
 * value before the two periods. In other words, these are equal: */
 fn main() {
     let s = String::from("hello");

     let slice = &s[0..2];
     let slice = &s[..2];
 }

 /** By the same token, if your slice includes the last byte of the String,
  * you can drop the trailing number. That means these are equal: */
  fn main() {
      let s = String::from("hello");

      let len = s.len()

      let slice = &s[3..len];       // same
      let slice = &s[3..];          // same
  }

/** You can also drop both values to take a slice of the entire string */
fn main() {
    let s = String::from("hello")

    let len = s.len();

    let slice = &s[0..len];
    let slice = &s[..];
}
// String slice range indices must occur at valid UTF-8 character

//** String literal are slices */
let s = "Hello, world!";
/** The type of s here is &str: it’s a slice pointing to that specific
 * point of the binary. This is also why string literals are immutable;
 * &str is an immutable reference. */

/** String Slices as Parameters */
fn first_word(s: &String) -> &str {} // rather use this
fn first_word(s: &str) -> &str {}


/** Example 2 */
fn first_word(s: &str) -> &str {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &s[0..i];
        }
    }

    &s[..]
}
fn main() {
    let my_string = String::from("hello world");

    // `first_word` works on slices of `String`s, whether partial or whole
    let word = first_word(&my_string[0..6]);
    println!("{}", word);
    let word = first_word(&my_string[..]);
    println!("{}", word);
    // `first_word` also works on references to `String`s, which are equivalent
    // to whole slices of `String`s
    let word = first_word(&my_string);
    println!("{}", word);

    let my_string_literal = "hello world";

    // `first_word` works on slices of string literals, whether partial or whole
    let word = first_word(&my_string_literal[0..6]);
    println!("{}", word);
    let word = first_word(&my_string_literal[..]);
    println!("{}", word);

    // Because string literals *are* string slices already,
    // this works too, without the slice syntax!
    let word = first_word(my_string_literal);
    println!("{}", word);
}

fn main() {
    let mut s = String::from("hello world");

    let word = first_word(&s);

    s.clear(); //error;

    println!("the first word is: {}", word);
}

fn first_word(s: &String) -> usize {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return i;
        }
    }

    s.len()
}

//** Other Slices */
fn main() {
    let a = [1,2,3,4,5,6];

    let slice = &a[1..3];

    assert_eq!(slice, &[2,3]);
}