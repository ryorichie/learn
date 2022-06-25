use rand::Rng;
use std::cmp::Ordering;
use std::io;

fn main() {
    println!("Guess the number!");

    let secret_number = rand::thread_rng().gen_range(1..=100);

    // println!("The secret number is: {}", secret_number);

    loop {
        println!("Please input your guess!");

        let mut guess = String::new();
        // "let mut" is function to make mutable variabel
        // "String::new" new is an associated function of string
        // which create empty string

        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line");

        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => {
                println!("Type number please");
                continue;
            },
        };
        //                 let guess: u32 = guess.trim().parse().expect("Please type a number"); (Original)

        println!("You guessed: {}", guess);
        match guess.cmp(&secret_number) {
            Ordering::Less => println!("To small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
            },
        }
    }
}
