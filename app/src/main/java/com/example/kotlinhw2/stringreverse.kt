package com.example.kotlinhw2

import java.util.*

class stringreverse {

    fun reverse(a:String)
    {// testingh is this has been changed or not
        var stack: Stack<String> = Stack<String>()
        var reName: String =" "
        for(i in 0..a.length-1)
        {
            stack.push(a[i].toString())

        }

        while(!stack.empty())
        {
            print(stack.pop())
        }

    }
}
fun main()
{
    val name: String = "urvish"
    val obj1= stringreverse()
    obj1.reverse(name)

}