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
  /** To use a struct after it defined, create an instance of that struct by specify
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
fn build_user(email: String, username String) -> User {
    User {
        email,
        username,
        active: true,
        sign_in_count: 1,
    }
}

//** Creating Instances From Other Instances With Struct Update Syntax */
struct User {
    active: bool,
    username: String,
    email: String,
    sign_in_count: u64,
}

fn main() {
    let default = User {
        email: String::from("company&email.com"),
        username: String::from("default"),
        active: true,
        sign_in_count: 1, 
    };

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
        ..default /** if we move string too from default, we can no longer use it. but it
        implement copy trait to bool and integer value, so it's safe */
    };
    println!("{}", andres_wijaya.active);
}

//** Using Tuple Structs without Named Fields to Create Different Types */
struct Color(i32, i32, i32);
struct Point(i32, i32, i32);

fn main() {
    let black = Color(0,0,0);
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

// Program to print area of the rectangle
fn main() {
    let width1 = 30;
    let height1 = 50;

    println!(
        "The area of the rectangle is {} square pixels.",
        area(width1, height1)
    );
}

fn area(width: u32, height: u32) -> u32 {
    width * height
}

// Refactoring with tuples 
fn main() {

    let rect1 = (30, 50);

    println!(
        "The area of the ractangle is {} square pixels.",
        area(rect1)
    );

    fn area(dimensions: (u32, u32)) -> u32 {
        dimensions.0 * dimensions.1
    }
}

// Refactirubg with struct: Adding more meaning
struct Rectangle {
    width: u32,
    heigth: u32,
}

fn main () {
    let rect1 = Rectangle {
        width: 30;
        heigth: 50;
    };

    println!(
        "The area of the rectangle is {} square pixels"
        area(rect1)
    );
}

fn area(rectangle: &Rectangle) -> u32 {
    rectangle.width * rectangle.heigth
}

// Attempting to print rectangle instance
#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

fn main() {
    let rect1 = Rectangle {
        width: 30,
        height: 50,
    };

    println!("rect1 is {:#?}", rect1);
}

#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

fn main() {
    let scale = 2;
    let rect1 = Rectangle {
        width: dbg!(30 * scale),
        height: 50,
    };

    dbg!(&rect1);
}

///** Method Syntax */
/** Method is similar to function, but they're defined 
 * within the context of a struct(enum or trait object),
 * their first parameter is always self, which represents
 * the instance of the struct the method is being called on
 * Method is a lot organize than function
 * calling different between method and function
 * Method: takenvariable.method(optionalsecondvariable) 
 * Function funtion(takenvariable)*/

//** Defining Method */
#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle { // int impl &self is alias for &Rectangle
    fn area(&self) -> u32 { //self is shorthand forn self: &self
        // &mut self, self, &self can be use here
        self.width * self.height
    }
}

fn main() {
    let rect1 = Rectangle {
        width: 30,
        height: 50,
    };

    // let rect2: (u32, u32) = (40,50); you can't replace struct with tupple

    println!(
        "The are of the rectangle is {} square pixels,
        the there are rectangle2 with {} square pixels",
        rect1.area(),
        // rect2.area(), it won't work with tupple
    );
}


// Other use for method: define boolean value
#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn width(&self) -> bool {
        self.width > 0
    }
}

fn main() {
    let rect1 = Rectangle {
        width: 30,
        height: 60,
    };

    if rect1.width() { //.width and .width() is different
        println!("The ractangle has a nonzero width, it's {}", rect1.width)
    }
}


//** Methods with More Parameters */
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn area(&self) -> u32 {
        self.width * self.height
    }

    fn can_hold(&self, other: &Rectangle) -> bool {
        self.width > other.width && self.height > other.height
    }
}

fn main() {
    let rect1 = Rectangle {
        width: 30,
        height: 50,
    };
    let rect2 = Rectangle {
        width: 10,
        height: 40,
    };
    let rect3 = Rectangle {
        width: 60,
        height: 45,
    };

    println!("Can rect1 hold rect2? {}", rect1.can_hold(&rect2));
    println!("Can rect1 hodl rect2? {}", rect1.can_hold(&rect2));
}


//** Associated Functions */
/** All functions that defined in impl block are associated funtion
 * We can define it without self as first parameter then it didn't need
 * instance of the type to wotk with. it's like String::from
 * associated function is method withoud self parameter
 */

 // Example

#[derive(Debug)]
struct Rectangle {
    width: u32,
    height: u32,
}

impl Rectangle {
    fn square(size: u32) -> Rectangle {
        Rectangle {
            width: size,
            height: size,
        }
    }
 }

fn buildrectangle (width: u32, height: u32) -> Rectangle {
    Rectangle {
        width,
        height,
    }
}

fn main() {
    let square2 = Rectangle::square(2); // we use :: syntax to call associated function
    let rect1 = buildrectangle(12, 12);

    println!("This square is {:#?}", square2);
    println!("Rectangle that i build is {:#?}", rect1)
}

 //** Multiple impl Blocks */
 /** Struct allowed multiple imple block */
struct Rectangle {
   width: u32,
   height: u32,
}

impl Rectangle {
    fn area(&self) -> u32 {
        self.width * self.height
    }
}
impl Rectangle {
    fn can_hold(&self, other: &Rectangle) -> bool {
        self.width > other.width && self.height > self.height
    }
}
