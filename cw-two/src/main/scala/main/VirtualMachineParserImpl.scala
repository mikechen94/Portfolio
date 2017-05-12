package main

import bc.{ByteCode, ByteCodeValues, InvalidBytecodeException}
import factory.VirtualMachineFactory
import vendor.Instruction
import vm.VirtualMachineParser

import util.control.Breaks._
/**
  * Created by Eric's laptop on 15/04/2017.
  */
class VirtualMachineParserImpl extends VirtualMachineParser with ByteCodeValues {


  override def parse(file: String): Vector[ByteCode] = {

    var code = scala.collection.immutable.Vector.empty[ByteCode]
    val bcp = VirtualMachineFactory.byteCodeFactory

    var vectorOfInstructions: Vector[Instruction] = VirtualMachineFactory.vendorParser.parse(file)

    for (i <- vectorOfInstructions.indices) {

      breakable {
        for (ii <- names.indices) {
          if (vectorOfInstructions(i).args(0) == 1){
            code = code :+ bcp.make(vectorOfInstructions(i).args(0).toByte, vectorOfInstructions(i).args(1))
            break
          }
          else if (vectorOfInstructions(i).args(0) <= 12 ) {
            code = code :+ bcp.make(vectorOfInstructions(i).args(0).toByte)
            break
          }
          //else {
            //  throw new InvalidBytecodeException("'" + names(i) + "'" + " is an invalid bytecode")
          //}
        }
      }
    }
    code
  }


  override def parseString(str: String): Vector[ByteCode] = {

    var code = scala.collection.immutable.Vector.empty[ByteCode]
    val bcp = VirtualMachineFactory.byteCodeFactory

    var vectorOfInstructions = VirtualMachineFactory.vendorParser.parseString(str)

    for (i <- vectorOfInstructions.indices) {
      var ii = 0
      breakable {
        while (ii < names.length) {
          if (vectorOfInstructions(i).name == names(ii)) {
            code = code :+ bcp.make(bytecode(vectorOfInstructions(i).name))
            break
          }
          else {
            ii = ii + 1
            if (ii == names.length - 1)
              throw new InvalidBytecodeException("'" + names(i) + "'" + " is an invalid bytecode")
          }
        }
      }

    }
    code
  }
}
//for (i <- insts.indices) {
//  assert(insts(i).name == all(i))
//}