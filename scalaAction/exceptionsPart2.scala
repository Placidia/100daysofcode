// More of throwing exceptions

def loopAndFail(end: Int, failAt: Int): Int = {
    for (i <- 1 to end){
        println(s"$i")
        if (i == failAt) throw new Exception("Too many iterations")
    }
    end
}

val t1 = util.Try(loopAndFail(2, 3))

val t2 = util.Try(loopAndFail(3, 2))

def nextError = util.Try{1/util.Random.nextInt(2)}

nextError.foreach(x => println(x))

val input = "  123  "
val result = util.Try(input.toInt) orElse util.Try(input.trim.toInt)

 val input = "  12a  "
input: String = "  12a  "

scala> val result = util.Try(input.toInt) orElse util.Try(input.trim.toInt)
result: scala.util.Try[Int] = Failure(java.lang.NumberFormatException: For input string: "12a")

val x = result match {
     case util.Success(x) => Some(x)
     case util.Failure(ex) => {
        println(s"Couldn't parse input '$input'")
        None
    }
}


