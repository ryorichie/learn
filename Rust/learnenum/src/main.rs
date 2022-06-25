////** Defining Enum */
/** Enums are a way of defining custom data types is different
 * way than you do with structs
 */

enum IpAddrKind {
    V4,
    V6,
 }

 // Enum Value
 fn main () {
  let four = IpAddrKind::V4; // enum are namespaced under its identifier like impl method
 let six = IpAddrKind::V6;

 // Function that takes any IpAddrKind:
 fn route(ip_kind: IpAddrKind) {}

 route(IpAddrKind::V4);
 route(IpAddrKind::V6);
}

/** Fpr exa,[;e we don't have way tp stpre actual IP Adress data;
 * we only know what kind it is
 */

 // example of tackle problem with stuct
enum IpAddrKind {
    V4,
    V6,
}

struct IpAddr {
    kind: IpAddrKind,
    address: String,
}

fn main () {
let home = IpAddr {
    kind: IpAddrKind::V4,
    address: String::from("127.0.0.1"),
};

let loopback = IpAddr {
    kind: IpAddrKind::V6,
    address: String::from("::1"),
};
}
// Better code, without struct
enum IpAddr {
    V4(String),
    V6(String),
}
fn main () {
let home = IpAddr::V4(String::from("127.0.0.1"));
// IpAddr:V4 is a function call that takes String and return instance of IpAddr type
let loopback = IpAddr::V6(String::from("::1"));
}
/** We can't use struct to store v4 addresses as four u8 values but
 * still can express v6 adressess as one String value, therefore we
 * use enum
 */

 // Better code, with effective enum
fn main ()
 { enum IpAddr {
    V4(u8, u8, u8, u8),
    V6(String),
 }

 let home = IpAddr::V4(127, 0, 0, 1);

 let loopback = IpAddr::V6(String::from("::1"));
}

 // You can even put struct inside enum, even enum itself
 struct Ipv4Addr {
    // --snip--
 }
 struct Ipv6Addr {
    // --snip--
 }

 enum IpAddr {
    V4(Ipv4Addr),
    V6(Ipv6Addr),
 }

 // Another example of enums
 enum Message {
    Quit, // has no data associated with it at all
    Move {x: i32, y: i32}, // has named fields like struct
    Write(String), // Includes a single String
    ChangeColor(i32, i32, i32), // Includes three i32 value
 }

 /** Defining an enum with variants such as the example above similar
  * to defining different kinds of struct definition, except enum
  * doesn;t use struct keyword and all the variants grouped togeher
  * under the Message type.
  */

  // Example if we hold same data as enum in struct
  struct QuitMessage;
  struct MoveMessage {
    x: i32,
    y: i32,
  }
  struct WriteMessage(String); // Tuple Struct
  struct ChangeColorMessage(i32, i32, i32); // tuple Struct
  // if we use struct, we couldn't easily define a function to take
  // any of these kinds message

  //using impl in enum
  #[derive(Debug)]
  enum Message {
    Quit, // has no data associated with it at all
    Move {x: i32, y: i32}, // has named fields like struct
    Write(String), // Includes a single String
    ChangeColor(i32, i32, i32), // Includes three i32 value
 }

 impl Message {
    fn call(&self) -> &Message {
       self
    }
 }
 fn main () {
    let m = Message::Write(String::from("hello"));
    println!("{:#?}", m.call())   
 }

///** Option Enum and Its Advantages Over Null Values */
/// you can use Some and None directly without the Option:: prefix
enum Option<T> {
   None,
   Some(T),
}

// Adding Option value and regular value
fn main() {
   let x: i8 = 5;
   let y: Option<i8> = Some(5);

   let sum = x + y.unwrap_or(0); // Use unwrap_or to use Option value
}

// Example
fn main () {
let some_number = Some(5); // Option<i32>::some
let some_string = Some("a stirng"); // Option<&str>::some

let absent_number: Option<i32> = None; // Option<i32>::none
}
////** The match Control Flow Construct */
/** match is extremly powerful control flow in rust, allow you to compare
 * a value against a series of patterns and then execute code based on
 * which pattern matches, thin of a match expression as being like
 * a coint-sorting machine. The first hole that is fits, go through
 */

 // Coin Sorter
 enum Coin {
   Penny,
   Nickel,
   Dime,
   Quarter
 }

 fn value_in_cents(coin: Coin) -> u8 {
   match coin {
      Coin::Penny => {
         println!("Lucky penny!");
         1
      },
      Coin::Nickel => {
         println!("Lucky Nickel");
         5
      },
      Coin::Dime => {
         println!("Lucky Dime!");
         10
      },
      Coin::Quarter => {
         println!("Lucky Quarter!");
         25
      },
   }
 }

 fn main() {
   let mystery = Coin::Penny;
   value_in_cents(mystery);
 }


 ///** Patterns that Bind to Values */
 /** We can hold enum in enum,  */
 #[derive(Debug)]
 enum UsState {
   Alabama,
   Alaska,
   Arizona,
   Arkansas,
   California,
   Colorado,
   Connecticut,
   Delaware,
   Floida,
   Georgia,
   Hawaii,
   Idaho,
   Illinois,
   Indiana,
   Lowa,
   Kansas,
   Kentucky,
   Louisiana,
   Maine,
   Maryland,
   Massachusetts,
   Michigan,
   Mennesota,
   Mississippi,
   Missouri,
   Montana,
   Nebraska,
   Nevada,
   NewHampshire,
   NewJersey,
   NewMexico,
   NewYork,
   NorthCarolina,
   NorthDakota,
   Ohio,
   Oklahoma,
   Oregon,
   Pennyslvania,
   RhodeIsland,
   SouthCarolina,
   SouthDakota,
   Tennessee,
   Texas,
   Utah,
   Vermont,
   Virginia,
   Washington,
   WestVirginia,
   Wisconsin,
   Wyoming,
 }

 enum Coin {
   Penny,
   Nickel,
   Dime,
   Quarter(UsState),
 }

 fn value_in_cents (coin: Coin) -> u8 {
   match coin {
      Coin::Penny => {
         println!("Lucky Penny");
         1
      },
      Coin::Nickel => {
         5
      },
      Coin::Dime => {
         10
      },
      Coin::Quarter(state) => {
         println!("State quarter fron {:?}!", state);
         25
      },
   }
 }

 fn main () {
   let s = Coin::Quarter(UsState::Indiana);
   value_in_cents(s);
 }

 ///** Matching with Option<T> */
 /// you can use Some and None directly without the Option:: prefix
fn main() {
fn plus_one(x: Option<i32>) -> Option<i32> {
   match x {
      None => None,
      Some(i) => Some(i + 1),
   }
}

let five = Some(5);
let six = plus_one(five);
let none = plus_one(None);
}



///** Catch-all Patterns and the _Placehorlder */
/** Imagine we're implementing a game where, if you roll 3 on a dice role,
 * player don't move and get fancy hat. Instead if you gey 7 you lose it */
// Example
fn main() {
   let dice_roll = 9;
   match dice_roll {
      3 => add_fancy_hat(),
      7 => remove_fancy_hat(),
      other => move_player(other),
   }
   fn add_fancy_hat() {}
   fn remove_fancy_hat() {}
   fn move_player() {}
}
/** because lass pattern will match all values. This catch-all pattern
 * meets the requerement that match must be exhaustive. Rust also has
 * pattern we can use when we don;t want to use the value in the catch-all
 * pattern: _, mhich special pattern that matches any value
 */

 // Using _
fn main() {
   let dice_roll = 9;
   match dice_roll {
      3 => add_fancy_hat(),
      7 => remove_fancy_hat(),
      _ => reroll(),
   }
   fn add_fancy_hat() {}
   fn remove_fancy_hat() {}
   fn reroll() {}
}
/** This example also meets the exhaustiveness requirement */

// Using _ to don't run any code at it
fn main () {
let dice_roll = 9;
match dice_roll {
    3 => add_fancy_hat(),
    7 => remove_fancy_hat(),
    _ => (),
}

fn add_fancy_hat() {}
fn remove_fancy_hat() {}
}

//// Concise Control Flow with if let
/** If let syntax let you combine if and lett into a less verbos way
 * to handle values that match one pattern while ignoring the rest
 */
// example using 2 arm match
fn main () {
   let config_max = Some(3u8);
   match config_max {
      Some(max) =>
      println!("The maximum is configured to be {}", max),
      _ => (),
   }
}

// using if let
fn main () {
   let config_max = Some(3u8);
   if let Some(max) = config_max {
      println!("The maximum is configured to be {}", &max);
   } else {
       count += 1; // We can use else in if let syntax
   }
}
