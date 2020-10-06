// Look at option statements
// The Options extend iterables (weirdly). And Option type never contains more than one element. It is a monadic type.

var x: String = "Indeed"

var a = Option(x)

x = null

var b = Option(x)

println(s"a is defined? ${a.isDefined}")
println(s"b is not defined? ${b.isEmpty}")