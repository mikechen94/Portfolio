package decorator

class GreenOlives(pizza: Pizza) extends PizzaDecorator (pizza) {

  override def getDesc = super.getDesc + sep + "Green Olivers (5.47)"

  override def getPrice: Double = super.getPrice + 5.47

}
