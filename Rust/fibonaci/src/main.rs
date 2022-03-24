fn main() {
    let mut fibonaci: i64 = 0;
    let mut fibonaci1: i64 = 0;
    let mut counter: i64 = 0;
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
        if fibonaci >= 9223372036854775807 {
            break
        }
    } 
}
