fun main(){
    myFunction()
    println(addUp(5,3))
    println(avg(3.2,5.3))
}

// Cú pháp của một hàm - fun là viết tắt của hàm
fun myFunction(){
// Phần thân của một hàm
    println("myFunction was called")
}

// Hàm này có hai tham số và trả về giá trị kiểu Int
fun addUp(a: Int, b: Int): Int{
    // từ khóa return cho biết rằng hàm này sẽ trả về giá trị sau
    // khi hàm này được gọi và thực thi
    return (a+b)
}
// Article on Kotlin words https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
// CHALLENGE: tạo một hàm tính giá trị trung bình và gọi nó
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}