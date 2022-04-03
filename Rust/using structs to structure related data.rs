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
        ..ryo_richie
    };
    println!("{}", andres_wijaya.username);
}
