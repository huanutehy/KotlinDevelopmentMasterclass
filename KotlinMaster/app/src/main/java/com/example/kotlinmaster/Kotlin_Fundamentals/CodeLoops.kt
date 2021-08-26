package com.example.kotlinmaster

fun main() {
    var condition = true
    // Loops Vòng lặp
    //While lặp cho đến khi thoả mãn điều kiệ
    while (condition) {
        println("Đây là tôi")
        //Khối lệnh copng việcn
    }
    var u = 10
    while (u <= 20) {
        println(" giá trị ban đầu của y là $u")
        u++
    }

    //Do - while khác nhau ở . Do while thực hiện cv r mới kiểm tra biểu thức điều kiện
    var z = 1
    do {
        println(" Giá trị của z : $z")
        //tăng giá trị của z để check
        z++
    } while (z <= 10)


    var feltTemp = "Cold"
    var roomTemp = 10
    while (feltTemp == "Cold") {
        roomTemp++
        if (roomTemp == 20) {
            println("Nhiệt độ oke r ")
        } else {
            print("Nhiệt độ vẫn còn lạnh lắm ")
        }

    }
    /*
      Vòng lặp for
      Dùng để lăph lại các phạm vi, mảng, tập hợp or bất cứ thứ gì
      Cung cấp trình vòng lặp
      */
     for ( num in 1..10){
         println("Giá trị num $num")
    }
    //cách viết khác
    for ( i in 1 until 10 ){
        println("Giá trị của i là $i")
    }
     for ( i in 10 downTo  1){
          println("Giá trị của i là $i")
     }
     for ( i in 1 until 10 step 2){
         println("Giá trị của i với bước nhày là 2 là $i ")
     }
     for( i in 1 until 10000){
         print("$i ")
          if(i == 9001){
              print("IT'S OVER 9000!!!")
          }
     }
     var doAm = "am"
     var numberDoAm = 80
    while (doAm == "am"){
        numberDoAm -= 5
        print("humidity decreased")
        if(numberDoAm == 60){
           doAm = " thoải mái"
            print("t's comfy now")
        }
    }
    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }
    }
    var x = 0
    for (y in 0..9) {
        x += y
    }

    println("$x")
}