package decorator

class SimplyVegPizza extends Pizza {
  def getDesc: String = {
    return "SimplyVegPizza"
  }

  def getPrice: Double = {
    return 230
  }
}
