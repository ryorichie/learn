use core::prelude::v1;
use std::vec;

fn main() {
    // Creating new empty vector
    let v: Vec<i32> = Vec::new();

    // Let vec using default integer type
    let v = vec![1, 2, 3];
    let s = vec![1, 2, 3]; //you can create vector like this
                           // vec!, macro that create new vector that holds the value you give it

    // Updating vector
    let mut v = Vec::new(); // Making the v mutable
    v.push(5); // code above actually clear v value
    v.push(6);
    v.push(7);
    v.push(8);

    // Dropping a Vector
    {
        let v = vec![1, 2, 3, 4];
        // do stuff with v here
    } // v out of scope

    // Reading Elements of Vectors
    /** Using get method */
    let v = vec![1, 2, 3, 4, 5];

    let third: &i32 = &v[2];
    
}
