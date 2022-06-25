fn main() {
    let mut lyrics = [
        "12 drummers drumming",
        "Eleven pipers piping",
        "Ten lords a-leaping",
        "Nine ladies dancing",
        "Eight maids a-milking",
        "Seven swans a-swimming",
        "Six geese a-laying",
        "Five golden rings (five golden rings)",
        "Four calling birds",
        "Three French hens",
        "Two turtle-doves",
        "A partridge in a pear tree",
        ];

    let mut index = 1;

    loop {

        let day = match index {
            1 => "first",
            2 => "second",
            3 => "third",
            4 => "fourth",
            5 => "fifth",
            6 => "sixth",
            7 => "seventh",
            8 => "eighth",
            9 => "ninth",
            10 => "tenth",
            11 => "eleventh",
            12 => "twelfth",
            _ => "",
        };

        if index > 1 {
            lyrics[11] = "And a partridge in a pear tree"
        }
        println!(
            "\nOn the {} day of Christmas\nMy true love sent to me",
            day
        );

        for number in 12-index..12 {
            println!("{}", lyrics[number]);
        }

        if index == 12 {
            break;
        }
        index += 1;
    }
    println!("And a partridge in a pear tree");
}
