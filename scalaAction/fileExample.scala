object FileExample {
    def main(args: Array[String]){
        val files = new java.io.File(".").listFiles

        for (file <- files){
            val filename = file.getName
            if(filename.endsWith(".scala")) println(file)
        }
    }
}