@file:Suppress("UNUSED_CHANGED_VALUE")

package com.example.kotlinmaster.Kotlin_Fundamentals

import kotlin.Int as Int1

fun main() {
    //biến có thể thay đổi được là bất biến
    // thêm to  để biết công việc hiện taị cần làm
//    var myName = "Huan"
//    println("Hello " + myName)
//    testVar()
//    //TODO tạo test array
//    testArray()
//    operatorNumber()
//    Condition()
    testWhen()
}

fun testArray() {
    //Khai bao kích thước cho mảng
    val arr = IntArray(5)
    //Khởi tạo giá trị cho mảng bằng 1 hằng số
    //Mảng int có kích thước bằng 5 với các giá trị là [42, 42, 42, 42, 42]

    val arr1 = IntArray(5) { 42 }
    //Khởi tạo các giá trij của mảng bằng lambda
    //Mảng này có kích thước bănng 5 với các giá trị [0 ->4
    val arr2 = IntArray(5) { it * 1 }

}


// variables and difference between val and var - Các biến và sự khác biệt giữa val và var
/*
 Sự khác việt giữa val và var
 - val là bất biến, cuối cùng, giá trị được gán đầu tiên không thể thay đổi.
 - var có thể thay đồi, có thể gán lại , có thể thay đổi giá trị nhiều lần

 Khi nào nên sử dụng val và var
* */
fun testVar() {
    val a: Int1 = 1
    var b: Int1 = 1
    println("${a + b}") // output 2

    b = 4
    println("${a + b}") // output 5
}

//Datatypes of number - Kiểu dữ liệu của số
/*
Toán tử số học ( +, -, *, /, %)
Toán tử so sánh ( ==, !=, <, >, <=, >=)
Toán tử gán ( +=, -=, *=, /=, %=)
Toán tử tăng & giảm ( ++, --)
 */
fun operatorNumber() {
    var a = 10
    var b = 20
    var c = ((a + b) * (a + b)) / 2 //450
    var isAlessB = a < b //true
    a++ // a now become 11
    b += 5 //b equals to 25 now
}

/*
 Các phép toán kiểu Boolean
 || hoặc
 && và và AND
 ! Không logic
 */
fun isBoolean() {
    val a = 4
    val b = 5
    a > b && a == b // false

    2 == 2 && 4 != 5  // true
    4 > 5 && 2 < 7    // false
    !(7 > 12 || 14 < 18)  // false
}

/*
 Condition and loops -- Điều kiện và vòng lặp
 */
fun Condition() {
    //If là 1 biểu thức trả về 1 giá trị
    // Không sử dụng được kiểu condition ? then: else
    val a = 10
    val b = 15
    var max = a
    if (a < b) max = b else max = a
    println(max)

    val maxxx = if (a < b) b else a
    println("Maxxx $maxxx")

}

fun testWhen() {
    var x = 0
    val y = 0
    when (x) {
        1 -> {
            println("x == 1")
        }
        2 -> print("x == 0")
        else -> {
            println(
                "No no"
            )
        }
    }
    when (y) {
        0, 1 -> println(" Oke r đấy")
        else -> print("Not oke")
    }
    // Dùng when để kiểm tra 1 giá trị tồn tại in or !in
    when (x) {
        in 1..10 -> println(" Test đc cáu nay r đất ")
        !in 10..20 -> println("Không nằm trong đoạn batf")
        else -> print("None")
    }
    //1 trường khợp khác là kiểm tra 1 giá trị is hoặc !is
    fun hasPrefic(x: Any) = when(x){
        is String -> x.startsWith("prefix")
        else ->false
    }
    // when cũng có thể thay thế cho if - else
    when{
       // x.isOdd() -> println("x is odd")
       // y.isEvent() -> print(" y is even ")
        else -> print(" X + Y is odd")
    }
    //cũng có thể nắm bắt asyn
//    fun Request.getBody()=
//        when(val respone = excuteRequest()){
//            is Succecss -> respone.body
//            is HttpError -> throw  HttpRetryException(respone.status)
//        }


}
