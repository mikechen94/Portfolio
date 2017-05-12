/**
  * Created by Eric's laptop on 12/04/2017.
  */
class Person1 (name: String) {

  val nameArray = name.split(" ")
  println (nameArray(0)+" "+nameArray(1))

}
object Person1 {

  def apply (name: String): Person1 = {
    new Person1 (name)
  }
}
