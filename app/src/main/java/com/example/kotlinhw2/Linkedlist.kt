package com.example.kotlinhw2

import java.util.*          //using this for importing java linkedlist

class Linkedlist() {

    fun iterative ( list: LinkedList<Int>)
    {
        println("this is iterative loop using for loop")
        for(i in list)
        {
            println(i)
        }
    }

    private var i=-1

    fun recursive (RecList: LinkedList<Int>): Int
    {
        i++
        return if(RecList.get(i)== null) {
            0
        } else {
            println(RecList.get(i))
            recursive(RecList)
        }
    }


}
fun main(){

    var llist = LinkedList<Int>();
    llist.add(85)
    llist.add(12)
    llist.add(34)
    llist.add(63)
    llist.add(53)

    var linkedList =Linkedlist()
    linkedList.iterative(llist)

    println("this is iterative loop using for loop")
    linkedList.recursive(llist)


}