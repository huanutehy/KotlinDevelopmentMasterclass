package com.example.kotlinmaster


fun main() {
// NULLABLES
// TÙY CHỌN trong Kotlin
// Kotlin hỗ trợ tính nullability như một phần của kiểu Hệ thống.
// Điều đó có nghĩa là Bạn có khả năng khai báo liệu
// một biến có thể giữ giá trị null hay không.
// Bằng cách hỗ trợ khả năng vô hiệu trong hệ thống kiểu,
// trình biên dịch có thể phát hiện
// các lỗi NullPointerException có thể xảy ra tại thời điểm biên dịch
// và giảm khả năng chúng bị ném vào thời gian chạy.
    var name: String = "Denis"
// name = null // Lỗi biên dịch
    var nullableName: String? = "Denis"
    nullableName = null // Làm

// Ở đây tên không được / không được rỗng
    val len = name.length
    val upper = name.toLowerCase()

// nhưng các phương thức tương tự sẽ không hoạt động trên các kiểu nullable
    //val len2 = nullableName.length // Compilation Error
    //val upper2 = nullableName.toLowerCase()  // Compilation Error

// Vì vậy, làm thế nào chúng ta có thể giải quyết điều này?
// Chúng ta có thể kiểm tra vô hiệu trước khi làm thủ tục
    val nullableName2: String? = "Denis"
    if (nullableName2 != null) {
        println("Hello, ${nullableName2.toLowerCase()}.")
        println("Your name is ${nullableName2.length} characters long.")
    } else {
        println("Hello, Guest")
    }

// Điều này hoạt động nhưng có vẻ như là một số công việc ...
// Vậy làm thế nào về việc chúng tôi rút ngắn cú pháp ...
// Kotlin cung cấp một nhà điều hành cuộc gọi An toàn,?.
// Nó cho phép bạn kết hợp kiểm tra null và
// một cuộc gọi phương thức trong một biểu thức duy nhất.

    nullableName2?.toLowerCase()

   // Điều này giống như:
    if (nullableName2 != null)
        nullableName2.toLowerCase()
    else
        null
// Bạn có thể sử dụng các phương thức trên một biến nullable như thế này
    val nullableName3: String? = null

    println(nullableName3?.toLowerCase()) // prints null
    println(nullableName3?.length) // prints null

// Bạn có thể thực hiện lệnh gọi chuỗi an toàn:
// val wifesAge: String? = user? .wife? .age
// Giả sử chúng ta không muốn in bất cứ thứ gì nếu
// biến là null? // Để thực hiện một thao tác chỉ khi
// biến không rỗng, chúng ta có thể sử dụng toán tử
// cuộc gọi an toàn với let -
    val nullableName4: String? = null

    nullableName4?.let { println(it.toLowerCase()) }
    nullableName4?.let { println(it.length) }
// Không in gì vì có nullableName là null
// và chúng tôi đã sử dụng let để ngăn chặn bất kỳ điều gì được thực hiện


// Điều gì sẽ xảy ra nếu chúng ta muốn nhập một giá trị mặc định?
// Sau đó, chúng ta có thể sử dụng toán tử elvis?:
    val name2 = nullableName4 ?: "Guest"

    //val wifesAge2: String? = user?.wife?.age ?: 0


// Không khẳng định rỗng: !! Toán tử
// Cái !! toán tử chuyển đổi kiểu nullable thành
// kiểu không phải null và ném NullPointerException
// nếu kiểu nullable giữ giá trị null.
// Điều này khá rủi ro và bạn chỉ nên sử dụng nó nếu
// bạn chắc chắn 100% rằng sẽ có một giá trị trong
// biến.
    val nullableName5: String? = null
    nullableName5!!.toLowerCase() // Results in NullPointerException

}



