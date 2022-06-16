package com.quevedo.cap2

class Ranges {
    static void main(args){
        def x = 1..10
        assert x.contains(5)
        assert x.size() == 10
        assert x.from == 1
        assert x.to == 10
        assert x.reverse() == 10..1
    }
}
