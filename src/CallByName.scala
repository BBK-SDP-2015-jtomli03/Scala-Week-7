/**
 * Created by Jo on 24/02/2015.
 */
object CallByName extends App{


  //while(condition) body
  // =>below we'll try to emulate a while statement with a method
  //conditional: => Boolean <-- here the callByName is declared by the colon :
  //the two ()() makes it easier to follow, we could put it al in one ()
  //this is lazy evaluation --> might not need to ever use this, therefore don't evaluate until needed
  def continue(conditional: => Boolean)(body: => Unit) { //returns Unit cos doesn't return anything
    if (conditional) {
      body
      continue(conditional)(body)
    }
  }

  var count = 0
  continue(count < 5){ //this line matches onto (conditional: => Boolean)
    println(s"value of count is $count")//this part matches (body: => Unit)
    count +=1
  }

  /*def a = 3
  def b = 5

  def meth(x: Int, y: Int) = {}

  meth(a,b)*/

}
