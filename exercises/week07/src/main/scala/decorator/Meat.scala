package decorator

class Meat(pizza: Pizza) extends PizzaDecorator (pizza) {

  override def getDesc = super.getDesc + sep + "Meat (14.25)"

  override def getPrice: Double = super.getPrice + 14.25
}
