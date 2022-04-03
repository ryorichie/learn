/** Struct or structure is a custom data type that lets you package together
 * and name multiple related values that make up a meaningful group, in object-oriented
 * language struct is like an object's data attributes*/

 ///** Defining and Instantiating Structs */
 /** Structs is similar to tuples, that both hold multiple related values.
  * Unlike tuples, in a struct you'll name each piece of data.
  * It's more flexible than tuples (don;t have to rely on the order of data to specify)
  */

  /** Making struct **/
  struct User {
      active: bool,
      username: String,
      email: String,
      sign_in_count: u64,
  }
  /** Tp ise a strict after it defined, creat an isntance of that struct by specify
   * concrete values for each of the field. We create an instance by stating the name of the struct
   * and then add curly brackets containing key: values pairs*/

   fn main() {
       let mut ryo_richie = User {
           email: String::from("ryorichie@gmail.com"),
           username: String::from("ryorichie"),
           active: true,
           sign_in_count: 1,
       };
       ryo_richie.email = String::from("ryorichie22@gmail.com");
       println!("{}",ryo_richie.email)
   }

/** build_user function **/
fn build_user(email: String, username: String) -> User {
    User {
        email: email,
        username: username,
        active: true,
        sign_in_count: 1,
    }
}

//** Using the field init shorthand */
fn build_user(email: String, usernameL String) -> User {
    User {
        email,
        username,
        active: true,
        sign_in_count: 1,
    }
}

//** Creating INstances From Other Instances With Struct Update Syntax */
struct User {
    active: bool,
    username: String,
    email: String,
    sign_in_count: u64,
}

fn main() {
    let mut ryo_richie = User {
        email: String::from("ryorichie@gmail.com"),
        username: String::from("ryorichie"),
        active: true,
        sign_in_count: 1,
    };
    ryo_richie.email = String::from("ryorichie22@gmail.com");
    println!("{}",ryo_richie.email);

    let mut andres_wijaya = User {
        email:String::from("srangga632@gmail.com"),
        username: String::from("Andres Wijaya"),
        ..ryo_richie /** if we move string too from ryo richie, we can no longer use it. but it
        implement copy trait to bool and integer value, so it's safe */
    };
    println!("{}", andres_wijaya.active);
}

//** Using Tuple Structs without Named Fields to Create Different Types */
struct Color(i32, i32, i32);
struct Point(i32, i32, i32);

fn main() {
    let balck = Color(0,0,0);
    let origin = Point(0,0,0);
}
/** Black and origin values are different types, becauese they're instances of different tuple structs
 * even though the fields within struct have same type */

//** Unit-Like Structs Without Any Fields */
/** You can also defini sructs that don't have any fields!, these are called unit-like structs
 * Unit-like structs can be useful when you need to imolement a trait on some type but don't have
 * any data that you want to store in the type itself */
struct AlwaysEqual; // without curly brackets or parentheses

fn main() {
    let subject = AlwaysEqual;
}

///** An Example Program Using Structs */
