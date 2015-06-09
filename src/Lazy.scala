/**
 * Created by Jo on 24/02/2015.
 */
//only makes sense to do lazy evaluation on immutables, NOT vars as we can just change these as we go along
object Lazy extends App{


  //eg. an expensive resource which you can get using an expensive method
  //if we put lazy in front of this it won't be initialised until we need to use it
  lazy val resource: Int = meth()

  def meth(): Int = {
    //do something expensive
    println("doing something expensive")
    0
  }

  //note in Java you can only use lazy on things that are a stream
  //in scala you can use on everything
}
