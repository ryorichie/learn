#![allow(dead_code)]
#![allow(unused_variables)]
#![allow(unused_imports)]
#[allow(unused_doc_comments)]
// Paths to code in modules
use crate::garden::vegetables::Asparagus;
pub mod garden;

// bring rand package defintions into the scope of our packages
use rand::Rng;

/// using nested paths to clean up large use list
// use std::cmp::Ordering;
// use std::io;
// code above can be
use std::{cmp::Ordering, io};

// use std::io;
// use std::io:Write;
// code above can be
// use std::io::{self, Write};

/// The Glob Operator
use std::collections::*;

// Bringing structs, enums, exc except module
use std::collections::HashMap;
/** it's idiomatic to specify full path on this */

fn main() {
    println!("Hello, world!");
    /** a package is one or more crates that provide a set of functionalitty
     * A package contains a Cargo.toml that desctibes how to build those cratees
     *
     * Kind of Crate
     * -    Library Crates, don't have main function, and the don't compile to an executable
     *      They define functionality intended to be shared with multple projects
     *
     * -    Binary Crates, program you can compile to an executable that you can run,
     *      Such as command-line program or a server. The must have a function called main
     *      that defines what happens when executable runs
     *
     * -    Crate root, source file that rust compiler starts from and makes up the
     *      root module of your crate
     *
     * A package can contain at most one library crate. It can contain as many binary crates
     * as you like, but it must contain at least one crate (either library or binary)
     *
     * there's no mention of src/main.rs because Cargo follows a convention
     * that src/main.s is the crate root of a binary crate with the same name as the
     * package. Likewise, Cargo knows that if the package sirectory contains src/lib.rs, the
     * package contains a library crate with the same name as the package
     */

    // Declaring modules
    mod garden {
        // Inline module
    }

    // Using vegetables submodule
    let plant = Asparagus {};
    println!("I'm growing {:?}", plant);

    // calling hashmap
    let mut map = HashMap::new();
    map.insert(1, 2);

    // Using rand
    let secret_number = rand::thread_rng().gen_range(1..101);
    fn function2() -> io::Result<()> {
        // --snip--
        Ok(())
    }
    // Other Binary Crate define on src/bin
    
    println!("Test Gitignore");
}
