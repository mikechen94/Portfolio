/**
  * Created by cchiu03 on 14/04/2017.
  */

//from https://gist.github.com/kencoba/1873880
class testing1 extends App {

  trait Button {
    def paint: String
  }

  class WinButton extends Button {
    def paint: String = "I'm a WinButton"
  }

  class OSXButton extends Button {
    def paint: String = "I'm a OSXButton"
  }

  trait GUIFactory {
    def createButton: Button
  }

  class WinFactory extends GUIFactory {
    def createButton: Button = new WinButton
  }

  class OSXFactory extends GUIFactory {
    def createButton: Button = new OSXButton
  }

  class Application(factory: GUIFactory) {
    val button = factory.createButton
    println(button.paint)
  }

  object ApplicationRunner {
    def main(argv: Array[String]) {
      new Application(createOsSpecificFactory(argv(0)))
    }

    def createOsSpecificFactory(os_type: String): GUIFactory = {
      os_type match {
        case "Win" => new WinFactory
        case "OSX" => new OSXFactory
      }
    }
  }

  ApplicationRunner.main(Array("Win"))
  ApplicationRunner.main(Array("OSX"))

}
