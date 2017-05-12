/**
  * Created by Eric's laptop on 11/04/2017.
  */
class Counter (val int: Int) {


  //var counter: Counter = null

  def this() {
    this(1)
  }


  def inc : Counter = {
    //int match {
      //case isEmpty => var int = 1

    var counter = new Counter(int + 1)
    counter
  }

  def dec: Counter = {
    var counter = new Counter(int - 1)
    counter
  }

  def count: Int = {
    int
  }

  def adjust (adder: Adder) : Counter = {
    var counter = new Counter(adder.add(count))
    counter
  }
}

// scala> println(new Adder(10).add(5))
// 15
