// introduction to Scala classes

class Donut(name: String, productCode: Long){
    def print = println(s"Donut Name = ${name}, Product Code = ${productCode}")
    
}

val boston = new Donut("Boston Cream", 1111)
val vanilla = new Donut("Vanilla", 2222)

boston.print
vanilla.print
