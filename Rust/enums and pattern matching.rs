////** Defining Enum */
/** Enums are a way of defining custom data types is different
 * way than you do with structs
 */

 enum IpAddrKind {
    V4,
    V6,
 }

 // Enum Value
 let four = IpAddrKind::V4; // enum are namespaced under its identifier like impl method
 let six = IpAddrKind::V6;

 // Function that takes any IpAddrKind:
 fn route(ip_kind: IpAddrKind) {}

 route(IpAddrKind::V4)
 route(IpAddrKind::V6)

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

let home = IpAddr {
    kind: IpAddrKind::V4,
    address: String::from("127.0.0.1"),
};

let loopback = IpAddr {
    kind: IpAddrKind::V6,
    address: String::from("::1"),
};

// Better code, without struct
enum IpAddr {
    V4(String),
    V6(String),
}

let home = IpAddr::V4(String::from("127.0.0.1"));
// IpAddr:V4 is a function call that takes String and return instance of IpAddr type
let loopback = IpAddr::V6(String::from("::1"));

/** We can't use struct to store v4 addresses as four u8 values but
 * still can express v6 adressess as one String value, therefore we
 * use enum
 */

 // Better code, with effective enum
 enum IpAddr {
    V4(u8, u8, u8, u8),
    V6(String),
 }

 let home = IpAddr::V4(127, 0, 0, 1);

 let loopback = IpAddr::V6(String::from("::1"))

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


