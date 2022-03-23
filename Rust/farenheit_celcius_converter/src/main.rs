fn main() {
    celcius_to_farenheit(30.2);
    farenheit_to_celcius(-29.2);
}

fn celcius_to_farenheit(celcius: f64) {
    let farenheit = (celcius * 1.8) + 32.0;
    println!("{} This is the farenheit value", farenheit)
}

fn farenheit_to_celcius(farenheit: f64) {
    let celcius = (farenheit - 32.0) / 1.8;
    println!("{} This is the celcius value", celcius)
}