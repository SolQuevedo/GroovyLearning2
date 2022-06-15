package com.quevedo.cap1

class Fibonacci {
    static void main(args) {
        def current = 1
        def next = 1
        10.times {
            print current + ' '
            def newCurrent = next
            next = next + current
            current = newCurrent
        }
        println ''
    }
}
