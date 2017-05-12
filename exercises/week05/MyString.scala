/**
  * Created by Eric's laptop on 12/04/2017.
  */
class MyString (val jString:String) {
        private var extraData = " "
        override def toString = jString+extraData
  }

  object MyString {

    def apply (base:String, extras:String) = {
      val s = new MyString(base)
      s.extraData = extras
      s
    }
  }


 println(MyString("hello"," world"))
 //println(MyString("hello"))


