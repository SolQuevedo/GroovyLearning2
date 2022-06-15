package com.quevedo.cap2
// G strings
class strings {
    static void main(args) {
        def nick = 'Gina'
        def book = 'Groovy in Action'
        assert "$nick is $book" == 'Gina is Groovy in Action'
        println(nick)
        println(book)
    }

}
