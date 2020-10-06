

object Donut {

    class Donut(name: String, productCode: Long){
        def print = println(s"Donut Name = ${name}, Product Code = ${productCode}")
    
    }

    def apply(name: String, productCode: Long): Donut = {
        new Donut(name, productCode)
    }
}

val vanillaDonut = Donut("Vanilla", 1111)