object PatternMatch {
    def main(args: Array[String]){
        val testNum = args(0).toInt

        def ordinal(x: Int) = x match{
            case 1 => println("First")
            case 2 => println("Second")
            case 3 => println("Third")
            case _ => println("I can't go higher than 3")
        }

        ordinal(testNum)
    }
} 