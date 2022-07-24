use aggregator::*;

fn main() {
    let tweet = Tweet {
        username:String::from("Ryorichie"),
        content:String::from("Rust lang is so amazing"),
        reply:false,
        retweet:false,
    };

    println!("1 new tweet {}", tweet.summarize());
}
