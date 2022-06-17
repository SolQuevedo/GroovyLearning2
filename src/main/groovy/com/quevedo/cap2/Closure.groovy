package com.quevedo.cap2
//Counting all the clinks at a party using a closure
class Closure {
    static void main(args) {
        def totalClinks = 0
        def partyPeople = 100
        1.upto(partyPeople) { guestNumber ->
            def clinksWithGuest = guestNumber-1
            totalClinks += clinksWithGuest
        }
        assert totalClinks == (partyPeople*(partyPeople-1))/2
    }
}
