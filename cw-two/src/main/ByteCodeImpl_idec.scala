package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_idec(val idec: String)  extends ByteCode {


  override val code: Byte = bytecode(idec)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int, virtualMachine) = vm.pop()
    vm.push(int-1)
    vm

  }

}
