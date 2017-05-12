object Abcd {

	sealed trait A {
		def foo: String
	}

	final case class B() extends A {
		def foo: String = "It's B!"
	}
	final case class C() extends A {
		def foo: String = "It's C!"
	}

	def main(args: Array[String]): Unit = {
		val bb=new B()
		val cc=new C()
		println(bb.foo + " " + cc.foo)
	}
}