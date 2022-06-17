package com.quevedo.cap3
//Groovy’s answer—everything’s an object
class Objects {

    static void main(args) {
        ArrayList results = new ArrayList()
        def listOne = [1,2,3]
        def listTwo = [4,5,6]

        for (int i=0; i < listOne.size(); i++) {
            Integer first = (Integer) listOne.get(i)
            Integer second = (Integer) listTwo.get(i)

            results.add (first + second)
        }
}

}
