/**
  * Created by Eric's laptop on 12/04/2017.
  */
class Person (name: String) {

  val nameArray = name.split(" ")
  println (nameArray(0)+" "+nameArray(1))

}
object Person {

  def apply (name: String): Person = {
    new Person (name)
  }
}

