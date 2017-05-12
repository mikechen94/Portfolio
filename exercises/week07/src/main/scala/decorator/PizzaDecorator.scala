package decorator

/**
  * Created by Eric's laptop on 27/04/2017.
  */
abstract class PizzaDecorator (val pizza: Pizza) extends Pizza{

  val sep = ", "

  override def getDesc: String = pizza.getDesc
  override def getPrice: Double= pizza.getPrice

}