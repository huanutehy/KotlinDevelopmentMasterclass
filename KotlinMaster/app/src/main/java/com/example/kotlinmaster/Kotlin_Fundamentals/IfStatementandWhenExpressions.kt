package com.example.kotlinmaster.Kotlin_Fundamentals

fun main(){
    // Control Flows - DÒng điều khiển
    // If Statements - Câu lệnh if
    var age = 17
    if(age >= 21){
        print("now you may drink in the US")
    }
    /// Câu lệnh if khác - chỉ được thực thi nếu câu lệnh if không đúng
    else if(age >= 18){
        print("now you may vote")
    }
    // Câu lệnh if khác - chỉ được thực thi nếu câu lệnh else if ở trên không đúng
    else if (age >= 16){
        print("you now may drive")
    }
    // else chỉ được thực thi nếu tất cả các câu lệnh ở trên không đúng
    else{
        print("you're too young")
    }

// Biểu thức "When" của Kotlin là sự thay thế của câu lệnh switch
// từ các ngôn ngữ khác như C, C ++ và Java.
// Nó nhỏ gọn và mạnh hơn các câu lệnh switch.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

// challenge - dịch câu lệnh if với age thành biểu thức when
    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    // Kiểm tra xem thuộc kiểu dữ liệu nào
    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

}