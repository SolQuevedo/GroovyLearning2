package com.quevedo.cap2
//Groovy beans
class Book {
    String title
     static void main(args) {
        def groovyBook = new Book()
        groovyBook.setTitle('Groovy conquers the world')
        assert groovyBook.getTitle() == 'Groovy conquers the world'
        groovyBook.title = 'Groovy in Action'
        assert groovyBook.title == 'Groovy in Action'
    }
}
