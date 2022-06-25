fn main() {
    let mut fibonaci: i128 = 0;
    let mut fibonaci1: i128 = 0;
    let mut counter: i16 = 0;
    loop {

        if fibonaci == 0 {
            println!("{}", fibonaci);
            fibonaci = 1;
            println!("{}", fibonaci);
        }
        counter += 1;
        println!("{}", counter);

        fibonaci1 = fibonaci + fibonaci1;
        println!{"{}",fibonaci1};

        counter += 1;
        println!("{}", counter);

        fibonaci = fibonaci1 + fibonaci;
        println!("{}", fibonaci);
        if fibonaci >= 9999999999999999999999999999999999999 {
            break
        }
    } 
}
