package com.quevedo.cap2
//Regular Expressions
class Regex {
    static void main(args) {
        assert '12345' =~ /\d+/
        assert 'xxxxx' == '12345'.replaceAll(/\d/, 'x')
    }
}
