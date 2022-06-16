package com.quevedo.cap2

class Lists {
    static void main(args){
        def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
        assert roman[4] == 'IV'
        roman[8] = 'VIII'
        assert roman.size() == 9
    }

}
