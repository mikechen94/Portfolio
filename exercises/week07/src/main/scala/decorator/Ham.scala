package decorator

class Ham(pizza: Pizza) extends PizzaDecorator (pizza) {

  override def getDesc = super.getDesc + sep + "Ham (18.12)"

  override def getPrice: Double = super.getPrice + 18.12

}
