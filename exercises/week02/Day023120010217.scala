sealed trait A {
def foo: String =
"It's A!"
}
final case class B() extends A {
override def foo: String = "It's B!"
def bar: Double = 13.27
}
final case class C() extends A {
override def foo: String = "It's C!"
}