package com.example.kotlinmaster

fun main(){
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    /*
    // Kotlin có một tính năng gọi là Nội suy chuỗi.
    // Tính năng này cho phép bạn chèn trực tiếp một biểu thức mẫu vào bên trong một Chuỗi.
    // Biểu thức mẫu là những đoạn mã nhỏ được đánh giá và /
    / kết quả của chúng được nối với Chuỗi ban đầu.
    // Biểu thức mẫu có tiền tố là biểu tượng $.
    // Sau đây là các ví dụ về nội suy chuỗi
     */
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")


}