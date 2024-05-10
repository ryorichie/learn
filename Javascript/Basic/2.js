const names = 'jeff'
// var naes = 'jeff'
let namess = 'jeff'

console.log(names)

let a = 'global';

function fun() {
    let b = 'local';
    console.log(a, b);

    if (true) {
        let b = 'block';
        console.log(b)
    }
    console.log(b)
}
fun()

function add(a, b) {
    return a + b
}

const add = function(a, b) {
    return a + b
}

function higherOrder(fun) {
    fun(1, 2);
    return function() {
        return fun(3, 4)
    }
}

function twfisthis() {
    console.log(this)
}