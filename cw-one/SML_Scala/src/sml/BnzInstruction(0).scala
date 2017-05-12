package sml

case class BnzInstruction(label: String, opcode: String, register: Int, loopNewStart: String, anteSml: Array[Array[String]], anteSmlTotLineNo: Int) extends Instruction(label, opcode) {

  override def execute(m: Machine) = {
    var loopStartLineNo = 0
	if (m.regs(register)!= 0) {
	  var j = -1
	  var loopStartLineNoFound = false
	  while (j < anteSmlTotLineNo && loopStartLineNoFound == false) {
	    j = j + 1
		if (anteSml(j)(0)== loopNewStart) {
		  loopStartLineNo = j  //count from zero
		  loopStartLineNoFound = true
		}
	  }
	}
	  var l = 0
	  var dummy = 0
	while (m.regs(register) != 0 && l<10){
		  for (k<-loopStartLineNo to anteSmlTotLineNo - 1){
			anteSml(k)(1) match {
			case ADD =>
			    dummy = 1
			case LIN =>
			    dummy = 1
			case MUL =>
				m.regs(anteSml(k)(2).toInt) = m.regs(anteSml(k)(3).toInt) * m.regs(anteSml(k)(4).toInt)
			case SUB =>
				m.regs(anteSml(k)(2).toInt) = m.regs(anteSml(k)(3).toInt) - m.regs(anteSml(k)(4).toInt)
			  case OUT =>
			    dummy = 1
			  case x =>
				println(s"Unknown instruction $x")
			}
		 }
		 l = l + 1
	}
  }

  override def toString(): String = {
    super.toString + " register " + register + " if the value there is not zero then execute from " + loopNewStart + " again \n"
  }
}

object BnzInstruction {
  def apply(label: String, register: Int, loopNewStart: String, anteSml: Array[Array[String]], anteSmlTotLineNo: Int) =
    new BnzInstruction(label, "bnz", register, loopNewStart, anteSml, anteSmlTotLineNo)
}