/**
 * Created by Jo on 24/02/2015.
 */
//another version of a curried function but shows its more useful side
//here you're sealing the value in
object AddX extends App {

  def addX(i: Int) = (j: Int) => i + j

  def addOne = addX(1)
  def addTwo = addX(2)

  println(addOne(5))
  println(addTwo(7))

}
