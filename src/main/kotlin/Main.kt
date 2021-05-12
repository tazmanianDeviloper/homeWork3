fun main() {
    println("Please enter the length of a rectangle: ")
    var length: Int = readLine()!!.toInt()
    println("Please enter the width of a rectangle: ")
    var width: Int = readLine()!!.toInt()
//Man be karbar ejaze nadadam ke andazehaye ghalat vared konad.
    while(length <= width){
        println("The length of a rectangle is grater than it's width.\nPlease re-enter the length: ")
        var length: Int = readLine()!!.toInt()

        if (length > width){
            println("The perimeter of your rectangle is: ${length*width/2}")
            println("The area of your rectangle is: ${length*width}")
            break
        }
    }

}


