use std::io;

fn main() {
    let mut value = String::new();
    loop {
        println!("Please type something to be analyse");

        io::stdin().read_line(&mut value).expect("Read error");

        let value: u32 = match value.trim().parse() {
            Ok(num) => num,
            Err(_) => {
                println!("Please type a number");
                continue
            }
        };

        println!("Your number is {}", value);
    }
}