fn main() {
    let mut x = 5;
    println!("The value of x is: {}", x);
    x = x + 1;
    println!("Then value of x change to: {}", x);
    const SECOND_IN_A_DAY: u32 = 60 * 60 * 24;
    println!(
        "This is const value, how many second in a day: {}",
        SECOND_IN_A_DAY
    );

    let z = 5;
    println!("The value z before shadowing is {}", z);
    let z = 6;

    {
        let z = z * 2;
        println!("The value of z in the inner scope is: {}", z);
    }

    println!("12 just in the scope, value in this scope is {} after shadowing", z)
}
