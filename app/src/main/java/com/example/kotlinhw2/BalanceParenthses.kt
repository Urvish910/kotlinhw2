package com.example.kotlinhw2

import java.util.*
//  this is 6/14/2022 second attemptzdxcv
// trying to create a pull request

// this is a pull request one
// thisd asd f ok
class BalanceParenthses {

    fun checkifbalance(test:String): Boolean {
        var stack: Stack<Any?> = Stack<Any?>()
        var inScope: Char = ' '
        for(i in test.indices)//test here
        {
            inScope = test[i]
            if(inScope == '(' || inScope == '[' || inScope == '{')
            {   stack.push(inScope)
                continue
            }
            if(stack.isEmpty())
            {
                return false
            }


            var outScope: Char
            if(inScope == ')') {
                outScope = stack.pop() as Char
                if(outScope=='{' || outScope==  '[')
                return false
            }
            if(inScope == '}') {
                outScope = stack.pop() as Char
                if(outScope=='(' || outScope==  '[')
                    return false
            }
            if(inScope == ']') {
                outScope = stack.pop() as Char
                if(outScope=='(' || outScope==  '{')
                    return false
            }

        }
        return (stack.isEmpty())
    }
}

fun main() {
    var obj1 = BalanceParenthses()

    var test = "{[{}]}"

    if(obj1.checkifbalance(test))
    {
        println("This is Balanced")
    }
    else
        println("This is 'Not' Balanced")
}
