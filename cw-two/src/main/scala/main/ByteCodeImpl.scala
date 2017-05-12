package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl (byte: Byte, args: Int*) extends ByteCode {

  /*def this (byte: Byte){this(2.toByte, 1)}
  def this (args: Int) {this(2.toByte)}*/

  //override def toString: String = byte.toString + " " + args.mkString(" ")
  override val code: Byte= byte


  override def execute(vm: VirtualMachine): VirtualMachine = {

    code match {

      case 1 =>
        vm.push(args(0))

      case 2 =>
        val (int1, virtualMachine1) = vm.pop()
        val (int2, virtualMachine2) = virtualMachine1.pop()
        virtualMachine2.push(int1 + int2)

      case 10 =>
        val (int, virtualMachine) = vm.pop()
        vm.push(int)
        vm.push(int)

      case 12 =>
        val (int, virtualMachine) = vm.pop()
        println(int)
        vm
    }
  }



      //val (int1, virtualMachine1) = vm.pop()
      //val (int2, virtualMachine2) = vm.pop()
      //vm.push(int1+int2)
}
