package com.example.kotlinhw2

import java.util.*

 class postfix() {

     var stack: Stack<Int> = Stack<Int>()

    fun evaluate(exp:String): Int? {
        for (i in 0..exp.length-1)
        {
            var c :Char = exp.get(i)
            //print(c)

            if(Character.isDigit(c))
                stack.push(c-'0')
            else
            {
                var  b = stack.pop()
                var  a= stack.pop()

                when(c)
                {
                    '+'-> stack.push(a+b)
                    '-'-> stack.push(a-b)
                    '*'-> stack.push(a*b)
                    '/'-> stack.push(a/b)
                }
            }
        }
        return stack.pop()

    }

}

fun main(){

    var test = postfix()

    var expression : String =  "9456+-"
    println(" the value of post fix is " )

    println(test.evaluate(expression))

}