package sml

class BnzInstruction(label: String, op: String, val result: Int, label2: String)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    val value = m.regs(result)
	val newlabel = m.labels.labels.indexOf(label2)
	// make label2 the next one to execute
	if (value != 0) m.execute(newlabel)
  }

  override def toString(): String = {
    super.toString + "if " + result + " !=0 labeled " +  label2
  }
}

object BnzInstruction {
  def apply(label: String, result: Int, label2: String) =
    new BnzInstruction(label, "bnz", result, label2)
}