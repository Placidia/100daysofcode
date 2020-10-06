// Looking at streams
import util.control.Breaks._

def inc(i: Int): Stream[Int] = stream.cons(i, inc(i + 1))

val s = inc(1)
s.take(5).toList

// In using the stream, we need to place limits on it, since it is potentially infinite.

// Equivalent functionality

def inc2(head: Int): Stream[Int] = head #:: inc2(head + 1)

val s2 = inc2(10)
s2.take(7).toList

println()

for (i <- s){
    println(i)
    if (i == 12) break
}