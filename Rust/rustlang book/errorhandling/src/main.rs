#[allow(dead_code)]
#[allow(unused_doc_comments)]
use std::fs::File;
use std::io::ErrorKind;
use std::io::{self, Read};

fn main() {
    /// Unrecoverable Errors with panic!
    // panic!("crash and burn");
    
    //Using a panic! Backtrace
    // let v = vec![1, 2, 3];
    // v[99];

    // Recoverable Errors with Result
    enum Result<T,E> { // Result type
        Ok(T),
        Err(E),
    }

    let f = File::open("hello.txt");
    let f = match f {
        Ok(file) => file,
        Err(error) => match error.kind() {
            ErrorKind::NotFound => match File::create("hello.txt") {
                Ok(fc) => fc,
                Err(e) => panic!("Problem creating the file {:?}", e),
            },
            other_error => {
                panic!("Problem opening the file: {:?}", other_error)
            }
        },
    };

    // let g = File::open("haji.txt").unwrap();
    // let h = File::open("haji.txt").expect("Failed to open the files");

read_username_from_file();

}

fn read_username_from_file() -> Result<String, io::Error> {
    // let i = File::open("username.txt");

    // let mut i = match i {
    //     Ok(file) => file,
    //     Err(e) => return Err(e),
    // };

    let mut i = File::open("hello.txt")?;

    let mut j = String::new();

    // match i.read_to_string(&mut j) {
    //     Ok(_) => Ok(j),
    //     Err(e) => Err(e),
    // } // using ? to handle it like match

    i.read_to_string(&mut j)?;
    Ok(j)
}

fn read_username_from_file_shorter() -> Result<String, io::Error> {
    let mut k = String::new();

    File::open("username.txt")?.read_to_string(&mut k)?;

    Ok(k)
}