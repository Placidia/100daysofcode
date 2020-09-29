object AboutLists {
    def main(args: Array[String]){
        val oldList = List(1, 2)
        val newList = oldList :+ 3
        println(oldList)
        println(newList)
    }
}