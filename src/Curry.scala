/**
 * Created by Jo on 24/02/2015.
 */
//currying
//
object Curry extends App{

  def cat1(s1: String, s2: String) = {
    s1 + s2
  }

  def cat2(s1: String)(s2: String) =
    s1 + s2

  def cat3(s1: String) = (s2: String) => s1 + s2

  //here we'll try to take the code from cat1 and curry it
  val cat1Curried = (cat1 _).curried

  println(cat1("fred ", "dodge"))
  println(cat2("fred ")("dodge"))
  println(cat3("fred ")("dodge"))
  println(cat3("fred ")) //when this is called with only one argument we get <function1>, we therefore get a function that adds fred to the start of the string
  val l = cat3("Hello ")  //we can get the function here and then
  println(l("betty")) //apply it here
  println(l("rita"))  //and here


  println(cat1Curried("XXX ")) //we get a function from this
  println(cat1Curried("XXX ")("YYY"))

}
