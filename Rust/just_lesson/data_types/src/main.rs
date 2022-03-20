use std::io;

fn main() {
    let mut valuese = String::new();
    loop {
        println!("Please type something to be analyse");

        io::stdin().read_line(&mut valuese).expect("Read error");

        let valuese: u32 = match valuese.trim().parse() {
            Ok(num) => num,
            Err(_) => {
                println!("Please type a number");
                continue
            }
        };

        println!("Your number is {}", valuese)
    }
}