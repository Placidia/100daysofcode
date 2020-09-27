// Examples of interesting data types.

// lazy evaluation.

object Variables {
    def main(args: Array[String]){
        var a = 2
        println(s"a has the value $a")
        println("b = a + 1, lazy")
        lazy val b = a + 1
        a = 5
        println(s"a now has value $a")
        println(s"b is a + 1: $b")
    }
}