package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_idiv(val idiv: String)  extends ByteCode {


  override val code: Byte = bytecode(idiv)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int1, virtualMachine1) = vm.pop()
    val (int2, virtualMachine2) = vm.pop()
    vm.push(int1/int2)
    vm

  }

}
