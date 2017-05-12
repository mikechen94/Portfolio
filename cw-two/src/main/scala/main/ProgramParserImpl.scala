package main


import com.sun.org.apache.bcel.internal.generic.InstructionList
import vendor.{Instruction, InvalidInstructionFormatException, ProgramParser}

import scala.collection.JavaConverters._
import scala.collection.mutable

class ProgramParserImpl extends ProgramParser {

  //def InstructionList(xs: Instruction*) = Vector(xs: _*)

  implicit class Regex(sc: StringContext) {
    def r = new util.matching.Regex(sc.parts.mkString, sc.parts.tail.map(_ => "x"): _*)
  }
  /*string match {
    case r".*.vm" => parse(string)
    case r"incont.*[0-9]" | "iadd" | "isub" | "imul" | "idiv" | "irem" | "ineg" | "iinc" | "idec" | "idup"
         | "iswp" | "print" => parseString(string)
    case _ =>
      val invalidInstructionFormatException = new InvalidInstructionFormatException("invalid instruction")
  }*/
  //var InstructionList = Vector[Instruction]

  override def parse(file: String): InstructionList = {
   var vectorOfInstructions = scala.collection.immutable.Vector.empty[Instruction]
    import scala.io.Source
    val lines = Source.fromFile(file).getLines
    for (line <- lines) {
      //val fields = line.split(" ")
      if (!line.isEmpty) {
        line match {
          case r"iconst.*[0-9]" =>
            val arraySplitIconst = line.split(" ").map(_.toString)
            var vectorNo_i = Vector (1, arraySplitIconst(1).toInt)
            var instruction = new Instruction("iconst", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList icount: " + vectorOfInstructions)
          case "iadd" =>
            var vectorNo_i = Vector (2)
            var instruction = new Instruction("iadd", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList iadd: " + vectorOfInstructions)
          case "isub" =>
            var vectorNo_i = Vector (3)
            var instruction = new Instruction("isub", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList isub: " + vectorOfInstructions)
          case "imul" =>
            var vectorNo_i = Vector (4)
            var instruction = new Instruction("imul", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList imul: " + vectorOfInstructions)
          case "idiv" =>
            var vectorNo_i = Vector (5)
            var instruction = new Instruction("idiv", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList idiv: " + vectorOfInstructions)
          case "irem" =>
            var vectorNo_i = Vector (6)
            var instruction = new Instruction("irem", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList irem: " + vectorOfInstructions)
          case "ineg" =>
            var vectorNo_i = Vector (7)
            var instruction = new Instruction("ineg", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList ineg: " + vectorOfInstructions)
          case "iinc" =>
            var vectorNo_i = Vector (8)
            var instruction = new Instruction("iinc", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList iinc: " + vectorOfInstructions)
          case "idec" =>
            var vectorNo_i = Vector (9)
            var instruction = new Instruction("idec", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList idec: " + vectorOfInstructions)
          case "idup" =>
            var vectorNo_i = Vector (10)
            var instruction = new Instruction("idup", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList idup: " + vectorOfInstructions)
          case "iswap" =>
            var vectorNo_i = Vector (11)
            var instruction = new Instruction("iswap", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList iswap: " + vectorOfInstructions)
          case "print" =>
            var vectorNo_i = Vector (12)
            var instruction = new Instruction("print", vectorNo_i)
            vectorOfInstructions = vectorOfInstructions :+ instruction
            //println("I am the InstructionList print: " + vectorOfInstructions)
          case _ =>
            println(new InvalidInstructionFormatException("'"+line+"'" + " is an invalid instruction"))
        }
      }

    }
    vectorOfInstructions
  }


  override def parseString(string: String): InstructionList = {

    var vectorOfInstructions = scala.collection.immutable.Vector.empty[Instruction]
    val arrayNameFromString = string.split("\n").map(_.toString)

    for (name <- arrayNameFromString){
      name match {
        case r"iconst.*[0-9]" =>
          val arraySplitIconst = name.split(" ").map(_.toString)
          var vectorNo_i = Vector (1, arraySplitIconst(1).toInt)
          var instruction = new Instruction("iconst", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList icount: " + vectorOfInstructions)
        case "iadd" =>
          var vectorNo_i = Vector (2)
          var instruction = new Instruction("iadd", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList iadd: " + vectorOfInstructions)
        case "isub" =>
          var vectorNo_i = Vector (3)
          var instruction = new Instruction("isub", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList isub: " + vectorOfInstructions)
        case "imul" =>
          var vectorNo_i = Vector (4)
          var instruction = new Instruction("imul", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList imul: " + vectorOfInstructions)
        case "idiv" =>
          var vectorNo_i = Vector (5)
          var instruction = new Instruction("idiv", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList idiv: " + vectorOfInstructions)
        case "irem" =>
          var vectorNo_i = Vector (6)
          var instruction = new Instruction("irem", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList irem: " + vectorOfInstructions)
        case "ineg" =>
          var vectorNo_i = Vector (7)
          var instruction = new Instruction("ineg", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList ineg: " + vectorOfInstructions)
        case "iinc" =>
          var vectorNo_i = Vector (8)
          var instruction = new Instruction("iinc", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList iinc: " + vectorOfInstructions)
        case "idec" =>
          var vectorNo_i = Vector (9)
          var instruction = new Instruction("idec", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList idec: " + vectorOfInstructions)
        case "idup" =>
          var vectorNo_i = Vector (10)
          var instruction = new Instruction("idup", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList idup: " + vectorOfInstructions)
        case "iswap" =>
          var vectorNo_i = Vector (11)
          var instruction = new Instruction("iswap", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList iswap: " + vectorOfInstructions)
        case "print" =>
          var vectorNo_i = Vector (12)
          var instruction = new Instruction("print", vectorNo_i)
          vectorOfInstructions = vectorOfInstructions :+ instruction
          //println("I am the InstructionList print: " + vectorOfInstructions)
        case _ =>
          println(new InvalidInstructionFormatException("'"+name+"'" + " is an invalid instruction"))
      }
    }
    vectorOfInstructions
  }

}
