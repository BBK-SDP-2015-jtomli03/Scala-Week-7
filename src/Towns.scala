package week7

/**
 * Created by Jo on 24/02/2015.
 */
object Towns extends App {

  //the map data structure in scala isn't the same as the map data structure in java, it means that it
  //handles null pointer exceptions. Can use a getOrElse method to return a string instead of doing an
  //"if or else" statement to handle a null pointer.
  val townsAndCounties = Map(
    "Essex" -> "Chelmsford",
    "Yorkshire" -> "Leeds",
    "Lancashire" -> "Madchester",
    "Devon" -> "Exeter"
  )

  println("Towns in Counties: ")
  println("Essex " + townsAndCounties.get("Essex")) //returns Essex: Some(Chelmsford)
  println("Yorkshire " + townsAndCounties.get("Yorkshire"))
  println("Kent " + townsAndCounties.get("Kent").getOrElse("Ooops!")) //returns Kent: None

}
