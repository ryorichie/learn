/
/// Basic note

/// How to create new cargo
// cargo new hello_cargo


/// Run your code cargo
// ./target/debug/hello_cargo


/// Cargo summary
// We can build a project using cargo build.
// We can build and run a project in one step using cargo run.
// We can build a project without producing a binary to check for errors using cargo check.
// Instead of saving the result of the build in the same directory as our code, Cargo stores it in the target/debug directory.


/// bringing library
use std::io;
// By default, Rust has a few items defined in the standard library 
// that it brings into the scope of every program. This set is called 
// the prelude, and you can see everything in it in the standard 
// library documentation. If a type you want to use isn’t in the 
// prelude, you have to bring that type into scope explicitly with 
// a use statement. Using the std::io library provides you with a 
// number of useful features, including the ability to accept user 
// input.



/// mutable variabel
let mut guess = String::new(); 
/// this is mutable
let fruit = "Apple" 
/// this isn't mutable, like const on javascript


/// note about std::io::stdin
// If we hadn’t imported the io library with use std::io
// at the beginning of the program, we could still use the
// function by writing this function call as std::io::stdin
// The stdin function returns an instance of std::io::Stdin,
// which is a type that represents a handle to the standard
// input for your terminal.


/// calling method
.method_name()


/// using rand cargo
use rand::Rng


/// code explenation
    io::stdin() 
    /// this is function to handle standar input for terminal
        .read_line(&mut guess) 
        /// this is method on the standard input handle to get input from the user
        .expect("Failed to read line"); // method to display this massage if code crash


        /// code explenation
let secret_number = rand::thread_rng().gen_range(1..101);
rand::thread_rng // This is function to gives us the particular random number generator
gen_range(1..101) // This is method takes a range expression as an arguments gen_range(start..end)
// 1..101 is equivalent with 1..=100


/// cmp method
use std::cmp::Ordering;
// cmp is method to compare 2 value\
// Ordering is enum that have 3 variant (Less, Greater, and Equal)


/// Using method to value
match guess.cmp(&secret_number) { //this code is comparing guess with secret_number
    Ordering::Less => println!("Too small!"),
    Ordering::Greater => println!("Too big!"),
    Ordering::Equal => println!("You win!"),
} // match expression i use to decide wha to do next vased on which variant of
// ordering was returned with values in guess, this match is like alternative if else


///code analysis
let guess: u32 = guess.trim().parse().expect("Please type a number!");
// rust allows us to shadow the previous value of guess with new one
// Shadowing lets us reuse the guess variable name rather than forcing
// us to create two unique variables. code aboove bind variable to expression//
guess.trim().parse()
// guess in expression refers to the original guess variable that contain sring input
// trim method in string will eliminate any whitespace \n(newline) or \r\n
// then parse method is convert the string to some type of number
// it's only works to string that can logically turn into number, and it so easily result error
let guess: u32
// : after guess tells Rust we'll annotate the variable's tyoe
// u32 is unsigned 32=bit integer


/// Handling invalid input
//From 
let guess: u32 = guess.trim().parse().expect("Please type a number");
//To
let guess: u32 = match guess.trim().parse() {
    Ok(num) => num,
    Err(num) => continue,
}; // swithc from expect call to match expression like cmp method

