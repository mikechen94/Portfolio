package decorator

class SimplyNonVegPizza extends Pizza {
  def getDesc: String = {
    return "SimplyNonVegPizza"
  }

  def getPrice: Double = {
    return 350
  }
}
