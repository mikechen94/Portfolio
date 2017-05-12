package main

import bc.{ByteCode, ByteCodeParser, ByteCodeValues}
import factory.VirtualMachineFactory

import scala.collection.immutable

class ByteCodeParserImpl extends ByteCodeParser with ByteCodeValues{


  override def parse(bc: Vector[Byte]): Vector[ByteCode] ={

    val bcp = VirtualMachineFactory.byteCodeFactory
    var vectorOfByteCode = immutable.Vector.empty[ByteCode]
    var counter = 0
    while (counter < bc.length) {

      if (bc(counter)==1) {
        vectorOfByteCode = vectorOfByteCode :+ bcp.make(bc(counter), bc(counter + 1))
        counter = counter + 2
      }else{
        vectorOfByteCode = vectorOfByteCode :+ bcp.make(bc(counter))
        counter = counter + 1

        }
      }
      vectorOfByteCode
    }

}
