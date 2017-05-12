package decorator

class RomaTomatoes(pizza: Pizza) extends PizzaDecorator (pizza) {

  override def getDesc = super.getDesc + sep + "Roma Tomatoes (5.20)"

  override def getPrice: Double = super.getPrice + 5.20
}
