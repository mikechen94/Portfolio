package main

import bc.{ByteCode, ByteCodeFactory, ByteCodeValues, InvalidBytecodeException}

/**
  * Created by Eric's laptop on 08/04/2017.
  */


class ByteCodeFactoryImpl extends ByteCodeFactory with ByteCodeValues{


    //val byteNumber=bytecode.map(_.swap)
    var bytecode1: ByteCode=_

    override def make(byte: Byte, args: Int*): ByteCode = {

      //implicit class Regex(sc: StringContext) {
        //def r = new util.matching.Regex(sc.parts.mkString, sc.parts.tail.map(_ => "x"): _*)
      //}

        byte match {
          case (1)=>
            if (args != null) {
              bytecode1 = new ByteCodeImpl(byte, args(0))
              bytecode1
            }else{
              bytecode1 = new ByteCodeImpl(byte)
              bytecode1
            }

          case  2| 3| 4| 5| 6| 7| 8| 9| 10| 11| 12 =>
            bytecode1 = new ByteCodeImpl(byte)
            bytecode1

          case _ =>
            println("'"+byte+"'" + " is an invalid instruction")
            throw new InvalidBytecodeException ("'"+byte+"'" + " is an invalid byte instruction")
        }
      }


}//r"iconst.*[0-9]"