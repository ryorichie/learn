use std::{
    fmt::{format, Debug, Display},
    path::Display as OtherDisplay,
};

// Making Trait
pub trait Summary {
    fn summarize_author(&self) -> String;
    fn summarize(&self) -> String {
        format!("Read more from {}", self.summarize_author())
    }
}
// impl Summary for NewsArticle {}, using default impl
// Implement Trait on a type
pub struct NewsArticle {
    pub headline: String,
    pub location: String,
    pub author: String,
    pub content: String,
}
impl Summary for NewsArticle {
    fn summarize_author(&self) -> String {
        format!("{}, by {}, ({})", self.headline, self.author, self.location)
    }
}
pub struct Tweet {
    pub username: String,
    pub content: String,
    pub reply: bool,
    pub retweet: bool,
}
impl Summary for Tweet {
    fn summarize_author(&self) -> String {
        format!("@{}", self.username)
    }
}

// Using trait as parameter
pub fn notify(item: &impl Summary) {
    println!("Breaking  news! {}", item.summarize_author())
}
// pub fn notify<T: Summary> (item: &T) {
//     println!("Breaking  news! {}", item.summarize_author())
// } // what really hapen

// Using 2 trait item in funtion
pub fn notify2var(item1: &impl Summary, item2: &impl Summary) {}
// Convenient way
pub fn notify2varconvent<T: Summary>(item1: &T, item2: &T) {}

// Specify multiple trait bond
pub fn notify2varmult(item1: &(impl Summary + Display)) {}
// Convenient way
pub fn notify2varconventmult<T: Summary + Display>(item1: &T, item2: &T) {}

// Clearer Trait Bound with where
pub fn withoutwhere<T: Summary + Display, U: Display + Debug>(item1: &T, item2: &U) {}
// Clearer Way
fn some_function<T, U>(t: &T, u: &U) -> i32
where
    T: Display + Clone,
    U: Clone + Debug,
{
    32
}

fn return_summarizable() -> impl Summary {
    Tweet {
        username: String::from("Ryorichie"),
        content: String::from("People will die eventually"),
        reply: false,
        retweet: false,
    }
} // impl trait just for retunr single type

// Using Trait Bounds to Conditionally Implement Methods
struct Pair<T> {
    x: T,
    y: T,
}
impl<T> Pair<T> {
    fn new(x: T, y: T) -> Self {
        Self { x, y }
    }
}
impl<T: Display + PartialOrd> Pair<T> {
    fn cmp_display(&self) {
        if self.x >= self.y {
            println!("The largest number is x = {}", self.x);
        } else {
            println!("The largest number is y = {}", self.y);
        }
    }
}