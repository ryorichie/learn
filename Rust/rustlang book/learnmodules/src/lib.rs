#![allow(dead_code)]
#![allow(unused_variables)]
#![allow(unused_imports)]
#[allow(unused_doc_comments)]


mod front_of_house {
    pub mod hosting {
        pub fn add_to_waitlist() {}
    }
}


fn deliver_order() {}
// This code is pathed to back_of_house::fix_incorrect_roder
mod back_of_house {
    fn fix_incorrect_order() {
        cook_order();
        super::deliver_order()
    }
    fn cook_order() {}

    //// Making Structs and Enums Public
    /// Public Struct
    pub struct Breakfast {
        pub toast: String,
        seasonal_fruit: String,
    }

    /// Public Enum
    pub enum Appetizer {
        Soup,
        Salad,
    } // if we make an enum public, all its varians are public


    impl Breakfast {
        pub fn summer(toast: &str) -> Breakfast {
            Breakfast {
                toast: String::from(toast),
                seasonal_fruit: String::from("peaches"),
            }
        }
    }
}


mod customer {
    use crate::front_of_house::hosting;
    /** we need to path hosting in this scope to this scope
     * path outside costumer scope won't work in customer scope
     */

    use crate::front_of_house::hosting::add_to_waitlist;
    /** code above is unidiomatic */

    pub fn eat_at_restaurant() {
        hosting::add_to_waitlist();
        // Specifying parent module(hosting::) when calling the function
        // makes it clear that the function isn't locally defined

        add_to_waitlist();
    }
}


/// Path
// Example
use crate::back_of_house::Breakfast;


/// Bringing Paths into Scope with the use keyword
// use crate::front_of_house::hosting;
// bringing hosting module to scope of eat_at_restaurant
// we only have to specify hosting::add_to_waitlist to call add_to_wailist


/// Re-exporting Names with pub use
pub use crate::front_of_house::hosting;
// Now we can use hosting on external code directly with
// restaurant::hosting::add_to_waitlist()

pub fn eat_at_restaurant() {
    //// Pathing
    // Absolute path
    crate::front_of_house::hosting::add_to_waitlist();

    // Relative path
    front_of_house::hosting::add_to_waitlist();

    #[allow(unused_doc_comments)]
    //// Making struct and enum public
    /// Making struct public
    let mut meal = back_of_house::Breakfast::summer("Rye");
    // Change our mind about what bread we'd like
    meal.toast = String::from("Wheast");
    println!("I'd like {} toast please", meal.toast);

    // The next line won't compile if we uncomment it; we're not allowed
    // to see or modify the seasonal fruit that comes with the meal
    // meal.seasonal_fruit = String::from("blueberries");

    #[allow(unused_doc_comments)]
    /// Making enum Public
    let order1 = back_of_house::Appetizer::Soup;
    let order2 = back_of_house::Appetizer::Salad;

    #[allow(unused_doc_comments)]
    /// Bringing Paths into Scope with the use keyword
    hosting::add_to_waitlist();
}


/// There is exception the way to bring standard libarary, it;s result types
use std::fmt; // one of both can be ::Result
use std::io; // So like fmt::Result and Result or io::Result and Result
// we can't bring  2 item with same name into scope with use statements

fn function1() -> fmt::Result {
    // --snip--
    Ok(())
}

fn function2() -> io::Result<()> {
    // --snip--
    Ok(())
}
/** As you can see, using parent modules distinguishes the two Result
 * types. if instead we specified use std::fmt::Result and
 * use std::io::Result, we'd have two Result types in the same scope
 */



 /// Providing New Names with as keyword
 // This is the solution to bringin two types of the same name into the same scope
 use std::fmt::Result;
 use std::io::Result as IoResult; // Chose new name for Result in io::Result
 
 fn function11() -> Result {
    // --snip--
    Ok(())
 }
 fn function21() -> IoResult<()> {
    // --snip--
    Ok(())
 }
