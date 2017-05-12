package decorator

import java.text.DecimalFormat

object TestDecoratorPattern {
  private var dformat: DecimalFormat = new DecimalFormat("#.##")

  def main(args: Array[String]) {
    var pizza: Pizza = new SimplyVegPizza
    pizza = new RomaTomatoes(pizza)
    //print(pizza)
    pizza = new GreenOlives(pizza)
    //print(pizza)
    pizza = new Spinach(pizza)
    print(pizza)
    /*pizza = new RomaTomatoes(pizza)
    print(pizza)
    pizza = new GreenOlives(pizza)
    print(pizza)
    pizza = new Spinach(pizza)
    print(pizza)
    pizza = new SimplyNonVegPizza
    print(pizza)
    pizza = new Meat(pizza)
    print(pizza)
    pizza = new Cheese(pizza)
    print(pizza)
    pizza = new Ham(pizza)
    print(pizza)*/

    var pizza1: Pizza = new SimplyNonVegPizza
    pizza1 = new Meat(pizza1)
    pizza1 = new Cheese(pizza1)
    pizza1 = new Cheese(pizza1)
    pizza1 = new Ham(pizza1)
    print(pizza1)

  }

  private def print(pizza: Pizza)
  {
    System.out.println("Desc: " + pizza.getDesc)
    System.out.println("Price: " + dformat.format(pizza.getPrice))
  }

}
