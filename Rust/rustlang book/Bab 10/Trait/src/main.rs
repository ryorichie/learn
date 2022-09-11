use aggregator::*;

fn main() {
    let tweet = Tweet {
        username:String::from("Ryorichie"),
        content:String::from("Rust lang is so amazing"),
        reply:false,
        retweet:false,
    };

    let article = NewsArticle {
        author: String::from("Ryo Richie"),
        location: String::from("Japan"),
        headline: String::from("I Believe I Can Fly"),
        content: String::from("I Believe I can Touch The Sky"),
    };

    println!("1 new tweet {}", tweet.summarize());

    notify(&article);
}
