package main

import bc.ByteCode
import vm.VirtualMachine

object ByteCodeImpl_iadd extends ByteCode {

  override val code: Byte = 1.toByte//bytecode("iadd")

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int1, virtualMachine1) = vm.pop()
    val (int2, virtualMachine2) = vm.pop()
    vm.push(int1+int2)
    vm

  }

}
