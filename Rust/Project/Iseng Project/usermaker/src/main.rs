#[derive(Debug)]

struct User {
    email: String,
    username: String,
    active_count: u32,
    is_active: bool,
}

impl User {
    fn usermaker (
        email: String,
        username: String,
    ) -> User {
        User {
            email: email,
            username: username,
            active_count: 20,
            is_active: true
                }
    }
}

/** is no different to make variable with impl or struct 
 * making it with impl i waste of time, but you can automate
 * certain part with impl to make it simple. it can be
 * achieve to by making default variable of struct and perform
 * field init shorthand syntax, or just make function of it
*/

fn main() {
    let ryo_richie =  User::usermaker(
        String::from("Ryorichie@gmail.com"), 
        String::from("Ryo Richie"), 
    );
    println!("Andres Wijaya contain : {:#?}", ryo_richie);
}

