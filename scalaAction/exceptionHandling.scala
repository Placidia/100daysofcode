// Exception handling

object ExceptionHandling {

    def rangeMatcher(num: Int) = num match {
        case within10 if within10 <= 10 => println("within 0 to 10")
        case within100 if within100 <= 100 => println("within 11 to 100")
        case _ => throw new IllegalArgumentException (
            "Only values between 0 and 100 are allowed"
        )
    }
    def main(args: Array[String]){
        val n = args(0).toInt
        try {
            rangeMatcher(n)
        } catch { case e: IllegalArgumentException => e.getMessage}
    }
}